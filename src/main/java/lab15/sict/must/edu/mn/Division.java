package lab15.sict.must.edu.mn;

public class Division {
    public double divide(double a, double b) {
        if (Math.abs(b) < 1e-10) {
            throw new IllegalArgumentException("Cannot divide by zero or near-zero value");
        }
        return a / b;
    }
}
