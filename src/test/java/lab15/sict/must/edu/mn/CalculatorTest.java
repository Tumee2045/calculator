package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.*;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    private void provideInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    // === Unit Tests for Core Logic ===

    @Test
    void testAddition() {
        Addition addition = new Addition();
        assertEquals(8, addition.add(5, 3));
    }

    @Test
    void testSubtraction() {
        Subtraction subtraction = new Subtraction();
        assertEquals(2, subtraction.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        assertEquals(15, multiplication.multiply(5, 3));
    }

    @Test
    void testDivision() {
        Division division = new Division();
        assertEquals(2, division.divide(6, 3));
    }

    @Test
    void testDivisionByZeroThrowsException() {
        Division division = new Division();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> division.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testInvalidOperatorThrowsException() {
        char invalidOp = '%';
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            double a = 1, b = 1;
            switch (invalidOp) {
                case '+' -> new Addition().add(a, b);
                case '-' -> new Subtraction().subtract(a, b);
                case '*' -> new Multiplication().multiply(a, b);
                case '/' -> new Division().divide(a, b);
                default -> throw new IllegalArgumentException("Invalid operator");
            }
        });
        assertEquals("Invalid operator", exception.getMessage());
    }

    // === Main Method Input Simulation Tests ===

    @Test
    void testCalculatorConstructor() throws Exception {
        var constructor = Calculator.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    void testAdditionMain() {
        provideInput("5\n+\n3\n");
        Calculator.main(null);
        assertTrue(outContent.toString().contains("Result: 8.0"));
    }

    @Test
    void testSubtractionMain() {
        provideInput("10\n-\n4\n");
        Calculator.main(null);
        assertTrue(outContent.toString().contains("Result: 6.0"));
    }

    @Test
    void testMultiplicationMain() {
        provideInput("6\n*\n7\n");
        Calculator.main(null);
        assertTrue(outContent.toString().contains("Result: 42.0"));
    }

    @Test
    void testDivisionMain() {
        provideInput("9\n/\n3\n");
        Calculator.main(null);
        assertTrue(outContent.toString().contains("Result: 3.0"));
    }

    @Test
    void testDivisionByZeroMain() {
        provideInput("5\n/\n0\n");
        Calculator.main(null);
        assertTrue(outContent.toString().contains("Cannot divide by zero"));
    }

    @Test
    void testInvalidOperatorMain() {
        provideInput("5\n%\n2\n");
        Calculator.main(null);
        assertTrue(outContent.toString().contains("Invalid operator"));
    }
}
