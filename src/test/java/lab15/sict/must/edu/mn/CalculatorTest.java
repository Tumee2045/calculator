package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6.0, calc.multiply(2.0, 3.0));
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2.0, calc.divide(6.0, 3.0));
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(4.0, 0.0));
    }
}
