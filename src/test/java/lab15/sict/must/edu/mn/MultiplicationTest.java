package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {

    @Test
    void testMultiplyBothZero() {
        Multiplication multiplication = new Multiplication();
        assertEquals(0.0, multiplication.multiply(0, 0));  // Case where both numbers are zero
    }

    @Test
    void testMultiplyAZero() {
        Multiplication multiplication = new Multiplication();
        assertEquals(0.0, multiplication.multiply(0, 5));  // Case where 'a' is zero
    }

    @Test
    void testMultiplyBZero() {
        Multiplication multiplication = new Multiplication();
        assertEquals(0.0, multiplication.multiply(5, 0));  // Case where 'b' is zero
    }

    @Test
    void testMultiplyAOne() {
        Multiplication multiplication = new Multiplication();
        assertEquals(5.0, multiplication.multiply(1, 5));  // Case where 'a' is one
    }

    @Test
    void testMultiplyBOne() {
        Multiplication multiplication = new Multiplication();
        assertEquals(5.0, multiplication.multiply(5, 1));  // Case where 'b' is one
    }

    @Test
    void testMultiplyNonZero() {
        Multiplication multiplication = new Multiplication();
        assertEquals(15.0, multiplication.multiply(3, 5));  // Normal case with non-zero values
    }

    @Test
    void testMultiplyNegative() {
        Multiplication multiplication = new Multiplication();
        assertEquals(-15.0, multiplication.multiply(-3, 5));  // Case where 'a' is negative
    }

    @Test
    void testMultiplyNegativeBoth() {
        Multiplication multiplication = new Multiplication();
        assertEquals(15.0, multiplication.multiply(-3, -5));  // Case where both 'a' and 'b' are negative
    }

    @Test
    void testMultiplyLargeNumbers() {
        Multiplication multiplication = new Multiplication();
        assertEquals(1000000.0, multiplication.multiply(1000, 1000));  // Case with large numbers
    }
}
