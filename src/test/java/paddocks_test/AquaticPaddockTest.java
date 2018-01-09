package paddocks_test;

import aquatic_dinosaurs.AqaticDinosaurs;
import aquatic_dinosaurs.Plesiosaur;
import aquatic_dinosaurs.Tusoteuthis;
import org.junit.Before;
import org.junit.Test;
import paddocks.AquaticPaddock;

import static org.junit.Assert.assertEquals;

public class AquaticPaddockTest {

    AquaticPaddock aquaticPaddock;
    AquaticPaddock aquaticPaddock2;
    AqaticDinosaurs aqaticDinosaurs;

    @Before
    public void before() {
        aquaticPaddock = new AquaticPaddock("Jurassic Sea World", "Aquatic", 45500, 1000);
        aquaticPaddock2 = new AquaticPaddock("Transfer Tank", "Aqatic", 40000, 500);
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
        aqaticDinosaurs = new Plesiosaur("Jessica", 2, 7, 500, "Aqatic", 600);
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
}
