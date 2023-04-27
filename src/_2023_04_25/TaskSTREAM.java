package _2023_04_25;

import _2023_03_16.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TaskSTREAM {
    /**
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     * -- Отфильтровать нв четные и не четные
     * -- Просуммировать все числа
     * -- Получить среднее значение
     * -- Найти суммы чисел кратных 3 и 5
     * <p>
     * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
     * -- Преобразовать список строк в список чисел
     * <p>
     * <p>
     * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi")
     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
     * -- Получить список слов которые содержат только уникальные символы
     * <p>
     * class Person {
     * String name
     * int age
     * }
     *
     * -- Сделать из списка объектов список имен и отфильтровать по возрасту
     */

    //Задание 1: Фильтрация списка целых чисел на нечетные числа
    private static void m1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers); // [1, 3, 5, 7, 9]
    }

    //Задание 2: Преобразование списка строк в список чисел
    private static void m2() {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numbers = strings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(numbers); // [1, 2, 3, 4, 5]
    }

    //Задание 3: Суммирование списка чисел
    private static void m3() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum); // 15
    }

    //Задание 4: Определение максимального значения в списке
    private static void m4() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);
        System.out.println(max.get()); // 5
    }

    //Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
    private static void m5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);
        System.out.println(max.get()); // 5
    }

    //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
    private static void m6() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<String> result = words.stream()
                .filter(s -> s.length() > 4)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result); // [banana, apricot, cherry]
    }

    //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
    private static void m7() {
        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
        List<String> names = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names); // [Alice, John, Bob]
    }

    //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
    private static void m8() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum); // 33 (3 + 5 + 6 + 9 + 10)
    }

    //Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
    private static void m9() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "grape");
        List<String> result = words.stream()
                .filter(s -> s.chars().distinct().count() == s.length())
                .collect(Collectors.toList());
        System.out.println(result); // [kiwi, grape]
    }

    //Задание 10:
    private static void m10(String[] strings) {
        Map<Character, Long> characterFrequency = Arrays.stream(strings)
                .flatMapToInt(CharSequence::chars)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        characterFrequency.forEach((character, frequency) -> System.out.println(character + ": " + frequency));
    }




    public static void main(String[] args) {
        m10(new String[]{"mama", "papa"});
    }
}