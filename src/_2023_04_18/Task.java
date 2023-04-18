package _2023_04_18;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    /**
     * Arrays.asList("a1", "a2", "a3","a4","a5","a6")
     * Отсортировать строки в алфавитном порядке и добавить их в массив
     */

    /**
     * Arrays.asList("a1", "a2", "a3","a4","a5","a6")
     * Отсортировать в обратном порядке, удалить дубликаты,
     * и преобразовать в массив с уникальными значениями
     */

    /**
     * String s = "UUjjhhYhYhYh";
     * Подсчитать будквы в нижнем и верхнем регистре
     */

    /**
     * Stream<String> stream = Stream.of("asd", "asdw","asdee","asdrr",)
     * Найти все строки максимальной длины
     */


    /**
     * String text = "???";
     * И вывести на экран все уникальные слова и количество их повторений
     * отсортировать в порядке убывания.
     * Так же подсчитать количество всех слов
     * Ex:
     * mama - 2
     * is - 3
     * i - 3
     * throw - 1
     */

    public static void main(String[] args) {
        Stream<String> st = Stream.of("asd", "asdw","asdee","asdrr");
        Optional<Map.Entry<Integer, List<String>>> optional =
                st.collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByKey());
    }
}
