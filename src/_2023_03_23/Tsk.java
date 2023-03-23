package _2023_03_23;

public class Tsk {
    /**
     * 123 --> 321
     * 1234 --> 4321
     * -223 --> -322
     * 120 --> 21
     */

    public static int reverse(int x) {
        int helper = 1;
        if (x < 0) {
            x = x * -1;
            helper = -1;
        }

        int result = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            result = result * 10 + lastDigit;
            x = x / 10;
        }
        return result * helper;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    /**
     * - 2(AB3(AB)AB) --> 2(ABABABABAB) --> ABABABABABABABABABAB
     * -
     */
}
