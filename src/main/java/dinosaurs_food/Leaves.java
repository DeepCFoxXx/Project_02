package dinosaurs_food;

public class Leaves implements Edible{

    private int healthValue;

    public Leaves() {
        this.healthValue = 15;
    }

    public int getHelathValue() {
        return this.healthValue;
    }
}
