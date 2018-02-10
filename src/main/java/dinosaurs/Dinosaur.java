package dinosaurs;

public abstract class Dinosaur implements IFeed{

    private String name;
    private int hieght;
    private int length;
    private int weight;
    private String type;
    private int healthValue;

    public Dinosaur(String name, int height, int length, int weight, String type, int healthValue) {
        this.name = name;
        this.hieght = height;
        this.length = length;
        this.weight = weight;
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.hieght;
    }

    public int getLength() {
        return this.length;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getType() {
        return this.type;
    }

    public int getHealth() {
        return this.healthValue;
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

    public void feed(int edible){
        this.healthValue += edible;
    }

}
