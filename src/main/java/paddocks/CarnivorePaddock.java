package paddocks;

import carnivore_dionsaurs.CarnivorousDinosaurs;

import java.util.ArrayList;

public class CarnivorePaddock extends Paddocks {

    private ArrayList<CarnivorousDinosaurs> carnivorePaddock;

    public CarnivorePaddock(String name, String type, int size, int defenseValue) {
        super(name, type, size, defenseValue);
        carnivorePaddock = new ArrayList<>();
    }

    public int getCount() {
        return this.carnivorePaddock.size();
    }

    public void addToPaddock(CarnivorousDinosaurs carnivorousDinosaurs) {
        this.carnivorePaddock.add(carnivorousDinosaurs);
    }

    public void removeFromPaddock(CarnivorousDinosaurs carnivorousDinosaurs) {
        this.carnivorePaddock.remove(carnivorousDinosaurs);
    }

    public void transferToPaddock(CarnivorousDinosaurs carnivorousDinosaurs, CarnivorePaddock newPaddock) {
        int index = carnivorePaddock.indexOf(carnivorousDinosaurs);
        CarnivorousDinosaurs dinosaurToRemove = this.carnivorePaddock.remove(index);
        newPaddock.addToPaddock(dinosaurToRemove);
    }
}
