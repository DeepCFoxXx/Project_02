package aquatic_dinosaurs;

import dinosaur_attack.IAttack;
import dinosaurs_food.Edible;

public class Plesiosaur extends AqaticDinosaurs {

    private String discription;
    private IAttack swipe;

    public Plesiosaur(String name, int height, int length, int weight, String type, int helathValue) {
        super(name, height, length, weight, type, helathValue);
        this.discription = discription;
        this.swipe = swipe;
    }

    public String getDiscription() {
        return "Plesiosaurs were an order of large carnivorous marine reptiles from 245 million years ago.";
    }

    public void feed(Edible edible){
        this.feed(edible);
    }

}
