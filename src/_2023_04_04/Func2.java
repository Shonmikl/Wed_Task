package _2023_04_04;

public class Func2 {
    public static void main(String[] args) {
        M2(Func2::METREF1);
    }

    public static void METREF() {
        System.out.println("####");
        System.out.println("@@@@");
    }

    public static void METREF1() {
        System.out.println("####");
        System.out.println("@@@@");
    }

    public static void M2(Rest rest) {
        System.out.println("$$$$");
        rest.get();
    }
}

@FunctionalInterface
interface Rest {
    void get();
}