package _2023_02_21;

import java.util.LinkedList;
import java.util.List;

public class Dividing {
    //  125 126 127 128 129 130 131 132 133 -----  256
    public static List<Integer> selfDiv(int first, int last) {
        List<Integer> list = new LinkedList<>();
        for (int i = first; i <= last; i++) {
            int j = i;
            for (; j > 0; j /= 10) {
                if ((j % 10 == 0) || (i % (j % 10) != 0)) {
                    break;
                }
            }
            if(j == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDiv(121, 299));
    }
}
