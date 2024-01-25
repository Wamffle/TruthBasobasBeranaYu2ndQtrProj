package cs4projecttruthbasobasberanayu;

import java.util.ArrayList;

public class Tile {
   private boolean flipped;
   private Card cardContained;
   public static ArrayList<Tile> board = new ArrayList<>(); //adds tile to the board arraylist
   
   public Tile() {
       board.add(this);
   }

    public boolean isFlipped() {
        return flipped;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public Card getCardContained() {
        return cardContained;
    }

    public void setCardContained(Card cardContained) {
        this.cardContained = cardContained;
    }
}
