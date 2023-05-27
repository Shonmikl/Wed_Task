package _2023_05_25;

public class SyncBlockSer {
    private static final Object LOCK = new Object();
    public static void main(String[] args) {
        Thread thread = new Thread(new C());
        Thread thread1 = new Thread(new C());

        thread.setName("T");
        thread1.setName("T1");
        thread.start();
        thread1.start();
    }

    static void m() throws InterruptedException {
        synchronized (SyncBlockSer.class) {
            Thread.sleep(1500);
            System.out.println(Thread.currentThread().getName());
            System.out.println("SyncBlockSer.class block");

            Thread.sleep(1500);
            synchronized (LOCK) {
                Thread.sleep(1500);
                System.out.println(Thread.currentThread().getName());
                System.out.println("LOCK block");

                Thread.sleep(1500);
            }
        }
    }
}
class C implements Runnable {

    @Override
    public void run() {
        try {
            SyncBlockSer.m();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
