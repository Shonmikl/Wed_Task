package _2023_04_20;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task22 {
    public static void main(String[] args) throws IOException {
        String context
                = Files.readString(Paths.get("_2023_04_20/text.txt"));
        List<String> words = Arrays.asList(context.split("\\P{L}+"));

        long count = words.stream().distinct().count();
        long countWithRepeat = words.stream().count();

        System.out.println("Слов всего: " + countWithRepeat);
        System.out.println("Уникальных слов: " + count);

        Arrays.stream(context.split("\\P{L}+"))
                .collect(Collectors.toMap(s -> s, n -> 1, Integer::sum))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(el -> System.out.println(el.getKey() + " : " + el.getValue()));
    }
}