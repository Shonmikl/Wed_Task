package _2023_04_04;

import java.util.*;
import java.util.function.Consumer;

public class Func1 {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("Vladimir", "Elina", "Anita");
        Set<Inter> set = new HashSet<>();

//        list.forEach(System.out::println);
//        list.stream()
//                .map(el -> {
//                    List<Character> characters = new ArrayList<>();
//                    for (int i = 0; i < el.length(); i++) {
//                        characters.add(el.charAt(i));
//                    }
//                    if()
//                        return
//                }).sorted()

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(5);
        list1.add(5);
        list1.add(51);
        list1.add(25);
        list1.add(3);
        list1.add(2);
        list1.add(13);

        list1.stream()
                .filter(el -> el % 5 == 0)
                .map(el -> el * 10)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}