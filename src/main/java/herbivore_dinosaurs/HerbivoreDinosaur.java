package herbivore_dinosaurs;;

import dinosaurs.*;

import java.util.Random;

public abstract class HerbivoreDinosaur extends Dinosaur {

    private int rage;

    public HerbivoreDinosaur(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
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