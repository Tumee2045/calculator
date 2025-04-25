package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    void testAddBothZero() {
        Addition addition = new Addition();
        assertEquals(0.0, addition.add(0, 0));
    }

    @Test
    void testAddAZero() {
        Addition addition = new Addition();
        assertEquals(5.0, addition.add(0, 5));
    }

    @Test
    void testAddBZero() {
        Addition addition = new Addition();
        assertEquals(5.0, addition.add(5, 0));
    }

    @Test
    void testAddBothNonZero() {
        Addition addition = new Addition();
        assertEquals(8.0, addition.add(3, 5));
    }
}
