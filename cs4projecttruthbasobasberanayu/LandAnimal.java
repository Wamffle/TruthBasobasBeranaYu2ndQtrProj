package cs4projecttruthbasobasberanayu;

import java.util.Collections;

public class LandAnimal extends Card {

    public LandAnimal(String n, String t) {
        super(n, t);
        type = "land";
    }
    
    @Override
    public void special() {
        System.out.println("EARTHQUAKE!!!!");
        Card.deck.clear();
            //loops through all the tiles
            for(int i=0; i<24; i++){
                //if the card is unflipped add that card to deck to be shuffled
                if(!Tile.board.get(i).isFlipped()){
                    Card.deck.add(Tile.board.get(i).getCardContained());
                }
            }
            Collections.shuffle(Card.deck);
                int counter=0;
                for(int i=0; i<Card.deck.size(); i++){
                    if(!Tile.board.get(i).isFlipped()){
                        Tile.board.get(i).setCardContained(Card.deck.get(counter));
                        counter++;                            
                    }
                }
                    for (int i = 0; i < 24; i++) {
                        System.out.println(Tile.board.get(i).getCardContained().getName());
                    }
                }
 }

