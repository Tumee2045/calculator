package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    void testDivideByZero() {
        // Test case for dividing by zero
        Division division = new Division();
        assertThrows(IllegalArgumentException.class, () -> division.divide(5, 0));
    }

    @Test
    void testDivideZero() {
        // Test case where numerator is zero
        Division division = new Division();
        assertEquals(0.0, division.divide(0, 5));
    }

    @Test
    void testDivideNonZero() {
        // Test case for dividing two non-zero numbers
        Division division = new Division();
        assertEquals(2.0, division.divide(10, 5));
    }

    @Test
    void testDivideNegative() {
        // Test case for dividing negative numbers
        Division division = new Division();
        assertEquals(-2.0, division.divide(-10, 5));
    }

    @Test
    void testDivideNegativeNumerator() {
        // Test case where numerator is negative
        Division division = new Division();
        assertEquals(-2.0, division.divide(-10, 5));
    }

    @Test
    void testDivideNegativeDenominator() {
        // Test case where denominator is negative
        Division division = new Division();
        assertEquals(-2.0, division.divide(10, -5));
    }

    @Test
    void testDivideFraction() {
        // Test case for fractional result
        Division division = new Division();
        assertEquals(0.5, division.divide(1, 2));
    }

    @Test
    void testDivideLargeNumbers() {
        // Test case for dividing large numbers
        Division division = new Division();
        assertEquals(1000000.0, division.divide(1000000000, 1000));
    }
}
