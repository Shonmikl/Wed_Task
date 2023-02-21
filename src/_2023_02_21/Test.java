package _2023_02_21;

public class Test {
    //0 0 0 0 0 1 0 1 = 5
    //0 0 0 0 0 1 1 0 = 6
    //0 0 0 0 0 0 1 1 = 3
    //0 0 0 0 0 1 1 0 = 6
    //0 0 0 0 0 0 1 1 = 3
    //0 0 0 0 0 1 0 0 = 4
    //0 0 0 0 0 1 0 1 = 5

    //0 0 0 0 0 1 0 0 = 4****
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 6, 3, 4, 5};
        int result = 0;
        for (int a : arr)
            result = result ^ a;
        System.out.println(result);

    }
}

