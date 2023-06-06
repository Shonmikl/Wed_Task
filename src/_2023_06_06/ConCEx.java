package _2023_06_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class ConCEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "qqq");
        map.put(2, "www");
        map.put(3, "eee");
        map.put(4, "rrr");
        map.put(5, "ttt");
        map.put(6, "yyy");

        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                map.put(new Random().nextInt(55), "*****");
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(7, "*****");
        };

        Thread T1 = new Thread(runnable1);
        Thread T2 = new Thread(runnable2);

        T1.start();
        T2.start();

        T1.join();
        T2.join();

        System.out.println(map);
    }
}
