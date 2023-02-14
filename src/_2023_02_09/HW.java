package _2023_02_09;

public class HW {


    public static void getTwoNumbers(int[] arr, int n) {
        int a = 0;
        int b = 0;

        //Дан массив и число n
        //Вывести на экран два любых числа из массива которые
        //в сумме дают n за O(n) либо написать что таких
        //чисел нет
        //[0 1 5 4 8 9 3 2 6] n = 13

        //** все пары чисел

        System.out.println("First number is: " + a);
        System.out.println("Second number is: " + b);
    }

    public boolean isDuplicated(int[] nums) {
        //вам необходимо проверить массив на наличие повторений чисел
        return false;
    }

    public static int getMinSequence(int[] nums, int s) {
        //[1 1 5 4 1 9 2 4 6] n = 11
        //вернуть длину минимальной последовательности
        //которая в сумме дает n
        //в массиве все числа положительные
        int result = Integer.MAX_VALUE;
        int left = 0;
        int valSum = 0; // 1 2 7 11

        for (int i = 0; i < nums.length; i++) {
            // [1 4 5 4 1 1 9 2 4 6 11] s = 11
            valSum += nums[i]; //valSum = valSum + nums[i]

            while (valSum >= s) {
                result = Math.min(result, (i + 1) - left);
                valSum = valSum - nums[left];
                left++;
            }
        }
        return (result == Integer.MAX_VALUE ? 0 : result);
    }

    public static String getNewString(String s) {
        //AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
        //**ДОБАВИТЬ ПРОВЕРКУ
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 5, 5, 5, 13};
        System.out.println(getMinSequence(arr, 25));
    }
}