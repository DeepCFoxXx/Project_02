package paddocks_test;

import aquatic_dinosaurs.AqaticDinosaurs;
import aquatic_dinosaurs.Plesiosaur;
import org.junit.Before;
import org.junit.Test;
import paddocks.AquaticPaddock;

import static org.junit.Assert.assertEquals;

public class AquaticPaddockTest {

    AquaticPaddock aquaticPaddock;
    AqaticDinosaurs aqaticDinosaurs;

    @Before
    public void before() {
        aquaticPaddock = new AquaticPaddock("Jurassic Sea World", "Aquatic", 45500, 1000);
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
}
