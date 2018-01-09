package herbivore_dinosaurs;;

import dinosaurs.*;

public abstract class HerbivoreDinosaur extends Dinosaur {

    public HerbivoreDinosaur(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
    }

}