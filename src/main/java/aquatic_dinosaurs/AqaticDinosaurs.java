package aquatic_dinosaurs;

import dinosaurs.*;

import java.util.Random;

public abstract class AqaticDinosaurs extends Dinosaur {

    private int rage;

    public AqaticDinosaurs(String name, int height, int length, int weight, String type, int helathValue) {
        super(name, height, length, weight, type, helathValue);
    }

    public void canRage() {
        Random rand = new Random();
        int amountOfRage = rand.nextInt(3);
        this.rage += amountOfRage;
    }

    public int getRage() {
        return rage;
    }

}
