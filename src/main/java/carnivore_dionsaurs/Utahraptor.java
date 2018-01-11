package carnivore_dionsaurs;

import dinosaurs_food.Edible;

public class Utahraptor extends CarnivorousDinosaurs {

    private String discription;

    public Utahraptor(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
        this.discription = discription;
    }

    public String getDiscription() {
        return "Largest known member of raptor family.";
    }

    public void feed(Edible edible){
        this.feed(edible);
    }
}
