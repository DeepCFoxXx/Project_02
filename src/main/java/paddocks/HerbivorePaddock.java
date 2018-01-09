package paddocks;

import herbivore_dinosaurs.HerbivoreDinosaur;

import java.util.ArrayList;

public class HerbivorePaddock extends Paddocks {

    private ArrayList<HerbivoreDinosaur> herbivorePaddock;



    public HerbivorePaddock(String name, String type, int size, int defenseValue) {
        super(name, type, size, defenseValue);
        herbivorePaddock = new ArrayList<>();

    }

    public int getCount() {
        return this.herbivorePaddock.size();
    }

    public void addToPaddock(HerbivoreDinosaur herbivoreDinosaurs) {
        this.herbivorePaddock.add(herbivoreDinosaurs);
    }

    public void removeFromPaddock(HerbivoreDinosaur herbivoreDinosaurs) {
        this.herbivorePaddock.remove(herbivoreDinosaurs);
    }

    public void transferToPaddock(HerbivoreDinosaur herbivoreDinosaur, HerbivorePaddock newPaddock) {
        int index = herbivorePaddock.indexOf(herbivoreDinosaur);
        HerbivoreDinosaur dinosaurToRemove = this.herbivorePaddock.remove(index);
        newPaddock.addToPaddock(dinosaurToRemove);
    }
}
