package lab15.sict.must.edu.mn;

public class Subtraction {
    public double subtract(double a, double b) {
        if (a == b) {
            return 0;
        } else if (b == 0) {
            return a;
        } else {
            return a - b;
        }
    }
}
