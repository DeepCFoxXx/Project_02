package herbivore_dinosaurs;

import dinosaurs_food.Edible;

public class Triceratops extends HerbivoreDinosaur {

    private String discription;

    public Triceratops(String name, int height, int length, int weight, String type, int healthValue) {
        super(name, height, length, weight, type, healthValue);
        this.discription = discription;
    }

    public String getDiscription() {
        return "With its 3 horns, a parrot-like beak and a large frill that could reach nearly 1 metre (3 feet) across.";
    }

    public void feed(Edible edible){
        //work out what happens when dinsosaur eats an edible
        this.feed(edible);
    }
}
