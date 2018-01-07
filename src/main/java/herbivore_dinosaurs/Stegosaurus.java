package herbivore_dinosaurs;

public class Stegosaurus extends HerbivoreDionsaurs {

    private String discription;

    public Stegosaurus(String name, int height, int length, int weight, String type) {
        super(name, height, length, weight, type);
        this.discription = discription;
    }

    public String getDiscription() {
        return "lived around 155 million years ago—during the Jurassic Period—in the Western portion of North America and parts of Europe.";
    }
}
