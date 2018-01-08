package herbivore_dinosaurs;

import dinosaurs_food.Edible;

public class Stegosaurus extends HerbivoreDionsaurs {

    private String discription;

    public Stegosaurus(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
        this.discription = discription;
    }

    public String getDiscription() {
        return "lived around 155 million years ago—during the Jurassic Period—in the Western portion of North America and parts of Europe.";
    }

    public void feed(Edible edible){
        //work out what happens when dinsosaur eats an edible
        this.feed(edible);
    }
}
