package paddocks;

public abstract class Paddocks {

    private String name;
    private String type;
    private int size;
    private int defenseValue;

    public Paddocks(String name, String type, int size, int defenseValue) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.defenseValue = defenseValue;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getSize() {
        return this.size;
    }
}
