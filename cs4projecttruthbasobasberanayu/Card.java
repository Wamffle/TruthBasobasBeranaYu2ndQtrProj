package cs4projecttruthbasobasberanayu;

import java.util.ArrayList;

//this is the abstract class and its subclasses are LandAnimal, AquaticAnimal, FlyingAnimal
public abstract class Card {

    private String name;
    private String trivia;
    private int points;
    public String type;
    public static ArrayList<Card> deck = new ArrayList<>();

    //contains name and trivia about the animal
    public Card(String n, String t) {
        name = n;
        trivia = t;
        
        //automatically adds card and its match to the deck
        deck.add(this);
        deck.add(this);
    }

    public String getName() {
        return name;
    }

    public String getTrivia() {
        return trivia;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    //prints the special move of the land or aquatic or flying animal
    public abstract void special();


}