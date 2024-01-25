package cs4projecttruthbasobasberanayu;

public class FlyingAnimal extends Card {

    public FlyingAnimal(String n, String t) {
        super(n, t);
        type = "flying";
    }
    
    @Override
    public void special() {
        System.out.println("Guardian Angel... Activate!");
    }
}
