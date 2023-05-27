package _2023_05_25;

public class SynchEx1 {

}

class Counter1 {
    volatile static int count = 0;
}

class MyRun implements Runnable {

    public void increment1() {
        //-->   -->
        synchronized (this) {
            Counter1.count++;
            System.out.println("[" + Counter1.count + "]");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            increment1();
        }
    }
}
