package _2023_05_23;

public class MTE1 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();
    }
}
class T1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (char i = 'a'; i < 'v'; i++) {
            System.out.println(i);
        }
    }
}
