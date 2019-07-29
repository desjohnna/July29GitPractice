import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class VowelsTest {
    Vowels unit;

    @Before
    public void setUp() {
        unit = new Vowels();
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, (unit.countVowels("good")));
        assertEquals(3,unit.countVowels("united"));
        assertEquals(5, unit.countVowels("celebration"));
        assertEquals(5,unit.countVowels("Celebration"));
        assertEquals(2, unit.countVowels("GOOD"));
    }
}
