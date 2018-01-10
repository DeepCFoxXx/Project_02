import dinosaurs.Dinosaur;
import paddocks.Paddocks;

import java.util.ArrayList;
import java.util.Random;

public class Park {

    private String name;
    private ArrayList<Paddocks> paddocks;
    private int visitors;
    private ArrayList<Dinosaur> rageHouse;

    public Park(String name) {
        this.name = name;
        this.paddocks = new ArrayList<Paddocks>();
        this.visitors = 0;
        this.rageHouse = new ArrayList<>();
    }

    public String getName() {
       return this.name;
    }

    public int getCount() {
        return this.paddocks.size();
    }

    public void addToPark(Paddocks paddocks) {
        this.paddocks.add(paddocks);
    }

    public void removeFromPark(Paddocks paddocks) {
        this.paddocks.remove(paddocks);
    }

    public int hasVisitors() {
        Random rand = new Random();
        int numberOfVisitors = rand.nextInt(10000);
        this.visitors += numberOfVisitors;
        return visitors;
        }


    public int getVisitors() {
        return visitors;
    }
}
