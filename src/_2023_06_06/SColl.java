package _2023_06_06;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SColl {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> writeArrayList = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentSkipListMap<Integer, String> concurrentSkipListMap = new ConcurrentSkipListMap<>();

//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(null, "jjj");
//        map.put(null, "jj2222j");
//        map.put(1, null);
//
//        System.out.println(map);
//        concurrentHashMap.put(1, null);
        System.out.println(concurrentHashMap);
    }
}
