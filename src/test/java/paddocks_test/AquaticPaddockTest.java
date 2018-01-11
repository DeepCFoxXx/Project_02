package paddocks_test;

import aquatic_dinosaurs.AqaticDinosaurs;
import aquatic_dinosaurs.Plesiosaur;
import aquatic_dinosaurs.Tusoteuthis;
import dinosaur_attack.IAttack;
import org.junit.Before;
import org.junit.Test;
import paddocks.AquaticPaddock;

import static org.junit.Assert.assertEquals;

public class AquaticPaddockTest {

    AquaticPaddock aquaticPaddock;
    AquaticPaddock aquaticPaddock2;
    AqaticDinosaurs aqaticDinosaurs;
    IAttack swipe;

    @Before
    public void before() {
        aquaticPaddock = new AquaticPaddock("Jurassic Sea World", "Aquatic", 45500, 1000);
        aquaticPaddock2 = new AquaticPaddock("Transfer Tank", "Aquatic", 40000, 500);
    }

    @Test
    public void aquaticPaddockHasName() {
        assertEquals("Jurassic Sea World", aquaticPaddock.getName());
    }

    @Test
    public void aquaticPaddockHasType() {
        assertEquals("Aquatic", aquaticPaddock.getType());
    }

    @Test
    public void aquaticPaddockHasSize() {
        assertEquals(45500, aquaticPaddock.getSize());
    }

    @Test
    public void aquaticPaddockHasDefenseValue() {
        assertEquals(1000, aquaticPaddock.getDefenseValue());
    }

    @Test
    public void aquaticPaddockStartsEmpty() {
        assertEquals(0, aquaticPaddock.getCount());
    }

    @Test
    public void aquaticPaddockCanAdd() {
        aquaticPaddock.addToPaddock(aqaticDinosaurs);
        assertEquals(1, aquaticPaddock.getCount());
    }

    @Test
    public void aquaticPaddockCanAddPlesiosaur() {
        aqaticDinosaurs = new Plesiosaur("Jessica", 2, 7, 500, "Aquatic", 600);
        aquaticPaddock.addToPaddock(aqaticDinosaurs);
        assertEquals(1, aquaticPaddock.getCount());
    }

    @Test
    public void aquaticPaddockCanReamove() {
        aquaticPaddock.addToPaddock(aqaticDinosaurs);
        aquaticPaddock.removeFromPaddock(aqaticDinosaurs);
        assertEquals(0, aquaticPaddock.getCount());
    }

    @Test
    public void canTransferToPaddock2() {
        aqaticDinosaurs = new Tusoteuthis("Sid", 300, 12, 300, "Aquatic", 350);
        aquaticPaddock.addToPaddock(aqaticDinosaurs);
        aquaticPaddock.transferToPaddock(aqaticDinosaurs, aquaticPaddock2);
        assertEquals(1, aquaticPaddock2.getCount());
        assertEquals(0, aquaticPaddock.getCount());
    }

    @Test
    public void aquaticPaddock2HasName() {
        assertEquals("Transfer Tank", aquaticPaddock2.getName());
    }

    @Test
    public void aquaticPaddock2HasType() {
        assertEquals("Aquatic", aquaticPaddock2.getType());
    }

    @Test
    public void aquaticPaddock2HasSize() {
        assertEquals(40000, aquaticPaddock2.getSize());
    }

    @Test
    public void aquaticPaddock2HasDefenseValue() {
        assertEquals(500, aquaticPaddock2.getDefenseValue());
    }

    @Test
    public void aquaticPaddock2StartsEmpty() {
        assertEquals(0, aquaticPaddock2.getCount());
    }

    @Test
    public void aquaticPaddock2CanAdd() {
        aquaticPaddock2.addToPaddock(aqaticDinosaurs);
        assertEquals(1, aquaticPaddock2.getCount());
    }

    @Test
    public void aquaticPaddock2CanAddTusoteuthis() {
        aqaticDinosaurs = new Tusoteuthis("Nancy", 400, 12, 500, "Aquatic", 800);
        aquaticPaddock2.addToPaddock(aqaticDinosaurs);
        assertEquals(1, aquaticPaddock2.getCount());
    }

    @Test
    public void aquaticPaddock2CanReamove() {
        aquaticPaddock2.addToPaddock(aqaticDinosaurs);
        aquaticPaddock2.removeFromPaddock(aqaticDinosaurs);
        assertEquals(0, aquaticPaddock2.getCount());
    }

    @Test
    public void canTransferToPaddock1() {
        aqaticDinosaurs = new Plesiosaur("Alan", 3, 8, 700, "Aquatic", 700);
        aquaticPaddock2.addToPaddock(aqaticDinosaurs);
        aquaticPaddock2.transferToPaddock(aqaticDinosaurs, aquaticPaddock);
        assertEquals(1, aquaticPaddock.getCount());
        assertEquals(0, aquaticPaddock2.getCount());
    }

}
