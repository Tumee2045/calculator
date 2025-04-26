package lab15.sict.must.edu.mn;

public class Multiplication {
    public double multiply(double a, double b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (a == 1) {
            return b;
        } else if (b == 1) {
            return a;
        } else {
            return a * b;
        }
    }
}
