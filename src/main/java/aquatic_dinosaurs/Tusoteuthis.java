package aquatic_dinosaurs;

public class Tusoteuthis extends AqaticDinosaurs{

    private String discription;

    public Tusoteuthis(String name, int height, int length, int weight, String type) {
        super(name, height, length, weight, type);
        this.discription = discription;
    }

    public String getDiscription() {
        return "Large ancestor of modern day giant squid, Eating habits included siphoning and drinking preys blood.";
    }

}