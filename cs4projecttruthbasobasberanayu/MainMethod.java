package cs4projecttruthbasobasberanayu;

import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tile t1 = new Tile();
        Tile t2 = new Tile();
        Tile t3 = new Tile();
        Tile t4 = new Tile();
        Tile t5 = new Tile();
        Tile t6 = new Tile();
        Tile t7 = new Tile();
        Tile t8 = new Tile();
        Tile t9 = new Tile();
        Tile t10 = new Tile();
        Tile t11 = new Tile();
        Tile t12 = new Tile();
        Tile t13 = new Tile();
        Tile t14 = new Tile();
        Tile t15 = new Tile();
        Tile t16 = new Tile();
        Tile t17 = new Tile();
        Tile t18 = new Tile();
        Tile t19 = new Tile();
        Tile t20 = new Tile();
        Tile t21 = new Tile();
        Tile t22 = new Tile();
        Tile t23 = new Tile();
        Tile t24 = new Tile();

        FlyingAnimal A = new FlyingAnimal("eagle", "this is an eagle!");
        FlyingAnimal B = new FlyingAnimal("flycatcher", "this is a flycatcher!");
        LandAnimal C = new LandAnimal("tarsier", "this is a tarsier!");
        LandAnimal D = new LandAnimal("bear cat", "this is a bear cat!");
        LandAnimal E = new LandAnimal("pangolin", "this is a pangolin!");
        FlyingAnimal F = new FlyingAnimal("bleeding-heart", "this is a bleeding-heart!");
        FlyingAnimal G = new FlyingAnimal("hornbill", "this is a hornbill!");
        LandAnimal H = new LandAnimal("cobra", "this is a cobra!");
        LandAnimal I = new LandAnimal("mouse deer", "this is a mouse deer!");
        AquaticAnimal J = new AquaticAnimal("crab", "this is a crab!");
        AquaticAnimal K = new AquaticAnimal("turtle", "this is a turtle!");
        AquaticAnimal L = new AquaticAnimal("crocodile", "this is a crocodile!");

        Player first = new Player("Sandy");
        Player second = new Player("Jekjek");
        boolean gameend = false;
        String tile;
        String tile2;
        Game one = new Game(first, second);
        for (int i = 0; i < 24; i++) {
            System.out.println(Tile.board.get(i).getCardContained().getName());
        }
        
        while(one.getCardsFlipped() < 24) {
            System.out.println("Which tile do you want to flip? Input a number from 0 to 23.");
            tile = sc.nextLine();
            System.out.println("Which tile do want to flip next? Input a number from 0 to 23.");
            tile2 = sc.nextLine();
            one.compare(Tile.board.get(Integer.parseInt(tile)), Tile.board.get(Integer.parseInt(tile2)));
            one.setCardsFlipped(0);
            for(int i = 0; i < 24; i++) {
                if (Tile.board.get(i).isFlipped()) {
                    one.setCardsFlipped(one.getCardsFlipped()+ 1);
                }
                else {
                    one.setCardsFlipped(0);
                }
            }
        }
        one.end();
    }

}