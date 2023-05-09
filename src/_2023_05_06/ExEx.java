package _2023_05_06;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExEx {
    private static int get(String s) {
        return s.hashCode();
    }
    private static void doSmth() throws FileNotFoundException {
        FileReader fileReader = new FileReader("rr.txt");
    }

    private static int getRes(int a, int b)  {
        if(b == 0) {
            throw new ArithmeticException("!!!!!!!");
        }
        return a / b;
    }



    public static void main(String[] args) {
        getRes(5, 0);
    }
}
