package paddocks;

import herbivore_dinosaurs.HerbivoreDionsaurs;

import java.util.ArrayList;

public class HerbivorePaddock extends Paddocks {

    private ArrayList<HerbivoreDionsaurs> herbivorePaddock;
    private ArrayList<HerbivoreDionsaurs> herbivorePaddock2;


    public HerbivorePaddock(String name, String type, int size, int defenseValue) {
        super(name, type, size, defenseValue);
        herbivorePaddock = new ArrayList<>();
        herbivorePaddock2 = new ArrayList<>();
    }

    public int getCount() {
        return this.herbivorePaddock.size();
    }

    public void addToPaddock(HerbivoreDionsaurs herbivoreDionsaurs) {
        this.herbivorePaddock.add(herbivoreDionsaurs);
    }

    public void removeFromPaddock(HerbivoreDionsaurs herbivoreDionsaurs) {
        this.herbivorePaddock.remove(herbivoreDionsaurs);
    }
}
