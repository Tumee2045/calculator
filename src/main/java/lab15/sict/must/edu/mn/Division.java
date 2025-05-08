package lab15.sict.must.edu.mn;
public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double result = a / b;
        if (Double.isNaN(result) || Double.isInfinite(result)) {
            throw new IllegalArgumentException("Result is not a finite number");
        }
        return result;
    }
}