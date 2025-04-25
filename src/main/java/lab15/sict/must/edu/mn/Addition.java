package lab15.sict.must.edu.mn;

public class Addition {
    public double add(double a, double b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return a + b;
        }
    }
}
