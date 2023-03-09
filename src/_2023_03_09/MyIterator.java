package _2023_03_09;

import javax.crypto.spec.PSource;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class MyIterator {


    boolean hasNext(List<Integer> list) {
        return false;
    }

    Integer next(List<Integer> list) {
        return null;
    }

    String remove(Integer number, List<Integer> list) {
        int count = 0;
        for (Integer integer : list) {
            if (Objects.equals(number, integer)) {
                count++;
            }
        }
        return count == 0 ? "no" : "del";
    }

    boolean hasPrevious(List<Integer> list) {
        return true;
    }

    Integer previous(List<Integer> list) {
        return 0;
    }
}