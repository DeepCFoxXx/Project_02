package paddocks;

import herbivore_dinosaurs.HerbivoreDionsaurs;

import java.util.ArrayList;

public class HerbivorePaddock extends Paddocks {

    private ArrayList<HerbivoreDionsaurs> dionsaurs;


    public HerbivorePaddock(String name, String type, int size, int defenseValue) {
        super(name, type, size, defenseValue);
        dionsaurs = new ArrayList<HerbivoreDionsaurs>();
    }

    public int getCount() {
        return this.dionsaurs.size();
    }

    public void addToPaddock(HerbivoreDionsaurs herbivoreDionsaurs) {
        this.dionsaurs.add(herbivoreDionsaurs);
    }

    public void removeFromPaddock(HerbivoreDionsaurs herbivoreDionsaurs) {
        this.dionsaurs.remove(herbivoreDionsaurs);
    }
}
