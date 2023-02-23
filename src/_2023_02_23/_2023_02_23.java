package _2023_02_23;

public class _2023_02_23 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = x + "";
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));
    }
}