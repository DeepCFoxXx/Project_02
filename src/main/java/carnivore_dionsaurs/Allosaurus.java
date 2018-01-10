package carnivore_dionsaurs;

import dinosaurs_food.Edible;

public class Allosaurus extends CarnivorousDinosaurs{

    private String discription;

    public Allosaurus(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
        this.discription = discription;
    }

    public String getDiscription() {
        return "The name Allosaurus means different lizard.";
    }

    public void feed(Edible edible){
        this.feed(edible);
    }
}
