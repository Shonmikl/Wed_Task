package _2023_04_04;

public class Func {
    public static void main(String[] args) {
        M1(() -> {
            System.out.println("////");
            System.out.println("++++");
        });
    }

    public static void M1(Inter inter) {
        System.out.println("----");
        inter.get();
    }
}

@FunctionalInterface
interface Inter {
   void get();
}

class Test implements Inter{

    @Override
    public void get() {
        System.out.println("^^^^^");
    }
}