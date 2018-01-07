package carnivore_dionsaurs;

public class Utahraptor extends CarnivorousDinosaurs {

    private String discription;

    public Utahraptor(String name, int height, int length, int weight, String type) {
        super(name, height, length, weight, type);
        this.discription = discription;
    }

    public String getDiscription() {
        return "Largest known member of raptor family.";
    }
}
