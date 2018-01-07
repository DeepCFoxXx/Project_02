package dinosaurs;

public abstract class Dinosaurs {

    private String name;
    private int hieght;
    private int length;
    private int weight;
    private String type;

    public Dinosaurs(String name, int height, int length, int weight, String type) {
        this.name = name;
        this.hieght = height;
        this.length = length;
        this.weight = weight;
        this.type = type;
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

}
