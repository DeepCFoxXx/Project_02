package dinosaurs_food;

public class Pig implements Edible{

    private int healthValue;

    public Pig() {
        this.healthValue = 150;
    }

    public int getHealthValue() {
        return this.healthValue;
    }
}
