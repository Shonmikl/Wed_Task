package _2023_05_30;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class ABQ {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(4);

        Thread producer = new Thread(() -> {
            String[] names = {"Alexander", "Sergey", "Konstantin", "Elina", "Al", "Yan", "Lu", "Anita", "Sonja"};
            for (int i = 0; i < names.length; i++) {
                try {
                    Thread.sleep(1500);
                    queue.put(names[i]);
                    System.out.println("Producer: " + names[i] + " : " + "COUNT --> " + queue.size()
                            + " ** " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer1 = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(5500);
                    sb.append(queue.take());
                    System.out.println("Consumer: " + sb.reverse() + " : " + "COUNT --> " + queue.size()
                            + " ** " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.setName("PRO1");
        consumer1.setName("CON1");

        producer.start();
        consumer1.start();
    }
}
