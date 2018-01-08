package dinosaurs_food;


public class Fish implements Edible{

    public int healthValue;

    public Fish() {
        this.healthValue = 100;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

}