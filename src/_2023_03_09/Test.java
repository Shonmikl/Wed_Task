package _2023_03_09;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> integers = new ArrayList<>();
        integers.add(22);
        integers.add(10);

        for (int i = 0; i < 10; i++) {
            set.add(new Random().nextInt(22));

        }



//        System.out.println(set);
//        System.out.println(set.contains(10));
//        System.out.println("************************");

        Iterator<Integer> iterator = set.iterator();
        ListIterator<Integer> listIterator = integers.listIterator(integers.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
            if(listIterator.previous() == 10) {
                listIterator.remove();
                System.out.println(listIterator.previous());
            }
        }
    }
}