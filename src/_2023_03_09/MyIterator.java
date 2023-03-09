package _2023_03_09;

import java.util.List;

public class MyIterator {
    boolean hasNext(List<Integer> list) {
        return true;
    }

    Integer next(List<Integer> list) {
        return null;
    }

    String remove(List<Integer> list) {
        //если объект есть то-Объект такой то удален
        //если нет то - объекта такого то нету
        return null;
    }

    boolean hasPrevious(List<Integer> list) {
        return true;
    }

    Integer previous(List<Integer> list) {
        return 0;
    }
}