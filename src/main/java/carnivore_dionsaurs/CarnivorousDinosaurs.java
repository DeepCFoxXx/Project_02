package carnivore_dionsaurs;

import dinosaurs.Dinosaur;

import java.util.Random;

public abstract class CarnivorousDinosaurs extends Dinosaur {

    private int rage;

    public CarnivorousDinosaurs(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
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

}
