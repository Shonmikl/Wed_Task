package mockit.exa;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    Saver saver = new Saver();
    public double multiply(double a, double b) {
        saver.save(a, b);
        return a * b;
    }
}

class Saver {
    List<Double> list = new ArrayList<>();

    public void save(double a, double b) {
        list.add(a);
        list.add(b);
    }
}

class CalcTest {
}
