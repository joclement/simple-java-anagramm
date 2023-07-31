package anagramm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagrammTest {

    @Test
    void testAreAnagamms() {
        assertTrue(Anagramm.areAnagramms("", ""));

        assertTrue(Anagramm.areAnagramms("a", "a"));
        assertTrue(Anagramm.areAnagramms("b", "b"));

        assertTrue(Anagramm.areAnagramms("listen", "silent"));
        assertTrue(Anagramm.areAnagramms("Listen", "siLent"));
        assertFalse(Anagramm.areAnagramms("Listen", "silent"));
    }
}
