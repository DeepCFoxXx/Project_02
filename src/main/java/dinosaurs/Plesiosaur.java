package dinosaurs;

import paddocks.Paddocks;

public class Plesiosaur extends AqaticDionsaurs {

    public Plesiosaur(String name, int height, int length, int weight, String type){
        super(name, height, length, weight, type);
    }

    public String getDiscription() {
        return "Plesiosaurs were an order of large carnivorous marine reptiles from 245 million years ago.";
    }
}
