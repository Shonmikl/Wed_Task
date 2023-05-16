package _2023_05_02;

import _2023_05_06.Task333;

import java.io.IOException;
import java.util.Scanner;

public class Task222 {


    //написать программу на Java, которая на вход получает массив
    //строк и проверяет, есть ли среди них хотя бы одна строка,
    // содержащая только цифры. Если есть, то программа должна вернуть эту строку,
    // иначе - вернуть null.
    public static void m1() {
        String[] strings = {"abc", "123", "456def", "789ghi"};
    }

    //написать программу на Java, которая считывает текстовый файл/string,
    //заменяет в нем все вхождения слова "???"
    //на слово "вырезано цензурой" и сохраняет изменения в тот же файл
    public static void m2() throws IOException {
        String fileName = "input.txt";
        String from = "is";
        String set = "*****";

    }

    //Напишите программу на Java, которая
    //запрашивает у пользователя строку и выводит
    //на экран все уникальные слова в этой строке, отсортированные в алфавитном порядке.
    public static void m3() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words;
    }

    public static void main(String[] args) throws IOException {
        m3();

        String s = "l;ll";
        s.split("(\\s|,|\\.|!|\\?|;|:)+");
    }
}

