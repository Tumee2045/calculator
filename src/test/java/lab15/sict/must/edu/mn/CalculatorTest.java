package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(0.0, calculator.add(-2.0, 2.0));
        assertEquals(-5.0, calculator.add(-2.0, -3.0));
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calculator.subtract(5.0, 4.0));
        assertEquals(-4.0, calculator.subtract(2.0, 6.0));
        assertEquals(0.0, calculator.subtract(3.0, 3.0));
    }
}
