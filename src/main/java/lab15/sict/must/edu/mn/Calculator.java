package lab15.sict.must.edu.mn;

import java.util.Scanner;

public class Calculator {

    private Calculator() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();

        System.out.println("=== Calculator ===");
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        try {
            double result = switch (op) {
                case '+' -> addition.add(a, b);
                case '-' -> subtraction.subtract(a, b);
                case '*' -> multiplication.multiply(a, b);
                case '/' -> division.divide(a, b);
                default -> throw new IllegalArgumentException("Invalid operator");
            };
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
