package herbivore_dinosaurs;

public class Triceratops extends HerbivoreDionsaurs {

    private String discription;

    public Triceratops(String name, int height, int length, int weight, String type) {
        super(name, height, length, weight, type);
        this.discription = discription;
    }

    public String getDiscription() {
        return "With its 3 horns, a parrot-like beak and a large frill that could reach nearly 1 metre (3 feet) across, the Triceratops skull is one of the largest and most striking of any land animal.";
    }
}
