package _2023_02_16;

import java.util.HashMap;
import java.util.Map;

public class STR {
    public static void main(String[] args) {
       Map<Integer, String> map = new HashMap<>();

       map.put(1, "Iuri");
       map.put(2, "Paul");
       map.put(3, "Karina");
       map.put(4, "Anita");
       map.put(null, "Eduard");

       System.out.println(map.hashCode());
    }
}