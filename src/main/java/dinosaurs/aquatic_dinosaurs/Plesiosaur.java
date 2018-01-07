package dinosaurs.aquatic_dinosaurs;

public class Plesiosaur extends AqaticDinosaurs {

    private String discription;

    public Plesiosaur(String name, int height, int length, int weight, String type) {
        super(name, height, length, weight, type);
        this.discription = discription;
    }

    public String getDiscription() {
        return "Plesiosaurs were an order of large carnivorous marine reptiles from 245 million years ago.";
    }

}
