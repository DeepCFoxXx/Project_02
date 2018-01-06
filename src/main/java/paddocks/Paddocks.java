package paddocks;

public abstract class Paddocks {

    private String name;
    private String type;
    private double size;
    private int defenseValue;

    public Paddocks(String name, String type, double size, int defenseValue) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.defenseValue = defenseValue;
    }

    public String getName() {
        return this.name;
    }
}
