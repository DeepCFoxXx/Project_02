package aquatic_dinosaurs;

import dinosaur_attack.IAttack;
import dinosaurs.*;

import java.util.Random;

public abstract class AqaticDinosaurs extends Dinosaur {

    private int rage;
    private IAttack attack;

    public AqaticDinosaurs(String name, int height, int length, int weight, String type, int helathValue) {
        super(name, height, length, weight, type, helathValue);
        this.rage = 0;
    }

    public void canRage() {
        Random rand = new Random();
        int amountOfRage = rand.nextInt(100);
        this.rage += amountOfRage;
    }

    public int getRage() {
        return rage;
    }

//    public void attack(Dinosaur dinosaur) {
//        this.attack.attack(dinosaur);
//    }

//    public boolean canGetOut() {
//        if (rage == this.rage) {
//            String dinosaur = "Is in paddock";
//        } else if (rage == this.rage);
//            String dinosaur = "Is Out Paddock";
//        return canGetOut();
//    }
}
