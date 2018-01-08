package aquatic_dinosaurs;

import dinosaurs_food.Edible;

public class Plesiosaur extends AqaticDinosaurs {

    private String discription;

    public Plesiosaur(String name, int height, int length, int weight, String type, int helathValue) {
        super(name, height, length, weight, type, helathValue);
        this.discription = discription;
    }

    public String getDiscription() {
        return "Plesiosaurs were an order of large carnivorous marine reptiles from 245 million years ago.";
    }

    public void feed(Edible edible){
        //work out what happens when dinsosaur eats an edible
        this.feed(edible);
    }

}
