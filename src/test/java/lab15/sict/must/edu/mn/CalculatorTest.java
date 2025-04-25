package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        // Prepare simulated user input for addition: 3 + 5
        String input = "3\n+\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        Calculator.main(new String[]{});

        // Assert the output contains the expected result
        assertTrue(outputStream.toString().contains("Result: 8.0"));
    }

    @Test
    void testSubtraction() {
        // Prepare simulated user input for subtraction: 5 - 3
        String input = "5\n-\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        Calculator.main(new String[]{});

        // Assert the output contains the expected result
        assertTrue(outputStream.toString().contains("Result: 2.0"));
    }

    @Test
    void testInvalidOperator() {
        // Prepare simulated user input for an invalid operator: 5 # 3
        String input = "5\n#\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        Calculator.main(new String[]{});

        // Assert the output contains the invalid operator error message
        assertTrue(outputStream.toString().contains("Invalid operator"));
    }
}
