package dinosaurs;

public abstract class AqaticDionsaurs {

    private String name;
    private int hieght;
    private int length;
    private int weight;
    private String type;

    public AqaticDionsaurs(String name, int height, int length, int weight, String type) {
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
}
