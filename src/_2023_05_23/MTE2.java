package _2023_05_23;

public class MTE2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TT1());
        Thread thread2 = new Thread(new TT2());

        thread1.setName("THREAD!");
        thread2.setPriority(10);
    }
}

class TT1 implements Runnable {

    @Override
    public void run() {
        System.out.println("TT1");
    }
}

class TT2 implements Runnable {

    @Override
    public void run() {
        System.out.println("TT2");
    }
}