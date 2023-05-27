package _2023_05_25;

import _2023_05_23.MTE3;
import lombok.ToString;

@ToString
public class SynchBlockEx {
    static final Object LOCK = new Object();
    static final RunWhat runWhat = new RunWhat();

    public static void main(String[] args) {

        Thread T1MOB = new Thread(new RunMob());
        Thread T2WH = new Thread(runWhat);
        Thread COPY = new Thread(runWhat);
        Thread T3TEL = new Thread(new RunTel());

        T1MOB.setName("T1MOB");
        T2WH.setName("T2WH");
        COPY.setName("COPY");
        T3TEL.setName("T3TEL");

        //T1MOB.start();
        T2WH.start();
        COPY.start();
        // T3TEL.start();
    }

    void mobile() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Mobile call start");
            Thread.sleep(2500);
            System.out.println("Mobile call End");
        }
    }

    synchronized void whatsApp() throws InterruptedException {
        System.out.println("!!!--" + Thread.currentThread().getName() + "--!!!");
        System.out.println("whatsApp call start");
        Thread.sleep(1500);
        System.out.println("whatsApp call End");
    }

    void telegram() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Telegramm call start");
            Thread.sleep(3500);
            System.out.println("Telegramm call End");
        }
    }
}

class RunMob implements Runnable {

    @Override
    public void run() {
        try {
            new SynchBlockEx().mobile();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class RunWhat implements Runnable {
    SynchBlockEx synchBlockEx = new SynchBlockEx();

    @Override
    public void run() {
        try {
            synchBlockEx.whatsApp();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class RunTel implements Runnable {

    @Override
    public void run() {
        try {
            new SynchBlockEx().telegram();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


