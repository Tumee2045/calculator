package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubtractionTest {

    @Test
    void testSubtractZero() {
        Subtraction subtraction = new Subtraction();
        assertEquals(5.0, subtraction.subtract(5, 0));  // Subtract zero
    }

    @Test
    void testSubtractNegative() {
        Subtraction subtraction = new Subtraction();
        assertEquals(-5.0, subtraction.subtract(0, 5));  // Subtract a positive from zero
    }

    @Test
    void testSubtractNonZero() {
        Subtraction subtraction = new Subtraction();
        assertEquals(2.0, subtraction.subtract(5, 3));  // Regular subtraction
    }

    @Test
    void testSubtractNegativeResult() {
        Subtraction subtraction = new Subtraction();
        assertEquals(-2.0, subtraction.subtract(3, 5));  // Subtracting a larger number from a smaller one
    }

    @Test
    void testSubtractSameNumber() {
        Subtraction subtraction = new Subtraction();
        assertEquals(0.0, subtraction.subtract(5, 5));  // Subtracting the same number
    }

    @Test
    void testSubtractLargeNumbers() {
        Subtraction subtraction = new Subtraction();
        assertEquals(1000000.0, subtraction.subtract(1000000, 0));  // Subtract large numbers
    }
}
