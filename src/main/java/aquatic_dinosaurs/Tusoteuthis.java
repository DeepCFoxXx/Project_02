package aquatic_dinosaurs;

import dinosaurs_food.Edible;

public class Tusoteuthis extends AqaticDinosaurs{

    private String discription;

    public Tusoteuthis(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
        this.discription = discription;
    }

    public String getDiscription() {
        return "Large ancestor of modern day giant squid, Eating habits included siphoning and drinking preys blood.";
    }

    public void feed(Edible edible){
        //work out what happens when dinsosaur eats an edible
        this.feed(edible);
    }

}
