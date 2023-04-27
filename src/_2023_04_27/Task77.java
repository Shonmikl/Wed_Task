package _2023_04_27;

import _2023_03_16.Person;

import java.util.Arrays;
import java.util.List;

public class Task77 {
    /**
     * Дан список строк. Необходимо найти количество строк, которые содержат
     * заданную подстроку.
     */
    private static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        String substring = "Java";
    }

    /**
     * Дан список целых чисел. Необходимо найти максимальный
     * элемент списка, который делится на заданное число без остатка
     */

    private static void m2() {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        int divisor = 5;
    }

    /**
     * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
     * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву
     */

    private static void m3() {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 25),
                new Person("Jack", 30),
                new Person("James", 35),
                new Person("Jill", 40)
        );
    }

    /**
     * Дана коллекция строк. Необходимо найти все уникальные слова,
     * которые содержатся в
     * этой коллекции строк, и вернуть их в виде списка
     */

    private static void m4() {
        List<String> lines = Arrays.asList(
                "Java is a programming language.",
                "Java is widely used in enterprise applications.",
                "Python is gaining popularity as a data science tool.",
                "Python is a versatile programming language."
        );
    }

    /**
     * Проверка корректности email адреса.REGEX
     */

    private static void m6() {
        String email = "example@example.com";
    }

    /**
     * Проверка, что строка представляет собой дату в формате "yyyy-mm-dd".REGEX
     */
    private static void m7() {
        String dateString = "2023-04-27";
    }
}