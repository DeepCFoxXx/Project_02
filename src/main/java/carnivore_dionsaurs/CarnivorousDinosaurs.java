package carnivore_dionsaurs;

import dinosaurs.Dinosaur;

import java.util.Random;

public abstract class CarnivorousDinosaurs extends Dinosaur {

    private int rage;
    private int calm;

    public CarnivorousDinosaurs(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
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
