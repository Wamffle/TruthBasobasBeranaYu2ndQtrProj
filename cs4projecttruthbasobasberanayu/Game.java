package cs4projecttruthbasobasberanayu;

import java.util.Collections;
import java.util.Scanner;

public class Game {

    private String previousType;
    private int currentPoints;
    private Player playerOne;
    private Player playerTwo;
    private Player playerCurrent;
    private int playerTracker;
    private int cardsFlipped;

    public Game(Player p, Player q) {
        playerOne = p;
        playerTwo = q;
        Collections.shuffle(Card.deck);
        for(int i = 0; i < 24; i++) {
            Tile.board.get(i).setCardContained(Card.deck.get(i));
        }
        Card.deck.clear();
    }

    public void compare(Tile a, Tile b) {
        if (playerTracker % 2 == 0) {
            playerCurrent = playerOne;
        } else {
            playerCurrent = playerTwo;
        }
        
        //prints the name of the animal on the 2 cards
        System.out.println(a.getCardContained().getName() + " and " + b.getCardContained().getName());
        //if you pick a card that is already flipped
        if (a.isFlipped() || b.isFlipped()) {
            System.out.println("you already picked that card!");

          //if the 2 flipped cards are match
        } else if (a.getCardContained() == b.getCardContained()) {
            System.out.println("It's a match!");
            
            //prints the trivia about the animal on the matched cards
            System.out.println(a.getCardContained().getTrivia());
            
            //flips up the 2 cards; they cannot be flipped anymore
            a.setFlipped(true);
            b.setFlipped(true);
            
            //if the previous card and the current card are both animals of the same type this power up is activated
            if (a.getCardContained().getType().equals(previousType)) {
                a.getCardContained().special();
                playerCurrent.powerUp(a.getCardContained().getType());
              
                //double trouble activate
                if(playerCurrent.isDoubleTroubleActive()) {
                    System.out.println("Do you want to risk to earn or lose twice the points?");
                    String prompt;
                    Scanner sc = new Scanner(System.in);
                    prompt = sc.nextLine();
                    if(prompt.equals("yes")){
                        if(a.getCardContained().getType()== b.getCardContained().getType()){
                        playerCurrent.setDoubleTroubleActive(false);
                        currentPoints-= 2000;
                        }
                        else {
                        currentPoints+=2000;
                        playerCurrent.setDoubleTroubleActive(false);
                        }
                    }
                    
                    else if (prompt.equals("no")){
                        playerCurrent.setDoubleTroubleActive(false);
                    }                            
                }
                                    
            }
            //points will be added normally
            previousType = a.getCardContained().getType();
            currentPoints += 1000;
            
          //game will continue if the 2 cards are still unflipped
        } else {
            //you can still continue your turn even if the cards do not match
            if (playerCurrent.isAngelActive()) {
                System.out.println("it's not a match :(");
                System.out.println("your guardian angel saved you!");
                //the guardian angel is not activated anymore after this turn
                playerCurrent.setAngelActive(false);
            }  
            
                //since the guardian angel is not activated anymore, not getting match cards will result to end of turn
            else {
                System.out.println("it's not a match :(");
                System.out.println(playerCurrent.getName() + " got " + currentPoints + " points!");
                playerCurrent.setTotalPoints(playerCurrent.getTotalPoints() + currentPoints);
                currentPoints = 0;
                playerTracker += 1;
                previousType = null;
                if (playerTracker % 2 == 0) {
                    System.out.println(playerOne.getName() + "'s Turn!");
                } else {
                    System.out.println(playerTwo.getName() + "'s Turn!");
                }
            }
        }
    }

    public void end() {
        System.out.println(playerOne.getName() + " got a total of " + playerOne.getTotalPoints() + " points!");
        System.out.println(playerTwo.getName() + " got a total of " + playerTwo.getTotalPoints() + " points!");
        playerOne.setTotalPoints(0);
        playerTwo.setTotalPoints(0);
    }

    public int getCardsFlipped() {
        return cardsFlipped;
    }

    public void setCardsFlipped(int cardsFlipped) {
        this.cardsFlipped = cardsFlipped;
    }
}
