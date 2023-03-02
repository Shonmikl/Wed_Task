package _2023_02_28;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LIE {
    //Метод, который генерит слова заглавными буквами,
    //используя 5 букв
    //Написать метод который добавляет в лист 1000 слов
    //Написать метод который принимает Лист и проверяет каждое слово
    //на палиндром
    //Вывод на экран СЛОВО : Палиндром/НЕ Палиндром
    public static void main(String[] args) {
        String s = "MADAM1";
        List<Character> characters = new LinkedList<>();
        for(char c : s.toCharArray()) {
            characters.add(c);
        }

        ListIterator<Character> listIterator
                = characters.listIterator();
        while (listIterator.hasPrevious() && listIterator.hasNext()) {
            System.out.println(listIterator.previous());
        }

        //l1
        //l2
        boolean isPalindrome;
    }
}
