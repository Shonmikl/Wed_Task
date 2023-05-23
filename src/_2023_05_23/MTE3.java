package _2023_05_23;

public class MTE3 extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("COUNTER: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        MTE3 mte3 = new MTE3();
        mte3.start();
        Thread.sleep(1500);

        System.out.println("1,5 sec later.......");
        mte3.b = false;
        mte3.join();

        System.out.println("Main End");
    }
}
