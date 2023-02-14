package _2023_02_14;

public class Debug {
    public static int getNumber(int[] a, int n) {
        int result = 0;
        for (int j : a) {
            if (j == n) {
                result = n;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {12, 3, 65, 4, 7, 8, 9};
        int b = 7;

        System.out.println(getNumber(a, b));
    }
}
