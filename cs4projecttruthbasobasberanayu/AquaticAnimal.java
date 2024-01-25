package cs4projecttruthbasobasberanayu;

public class AquaticAnimal extends Card {

    public AquaticAnimal(String n, String t) {
        super(n, t);
        type = "aquatic";
    }
    
    @Override
    public void special() {
        System.out.println("Double Trouble!");
        
    }
}
