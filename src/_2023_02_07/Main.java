package _2023_02_07;

public class Main {
    /**
     * HT
     *
     * дан массив, надо:
     * - если массив длины больше чем 4 - 3ий, и  4ий по минимальности элемент
     * если меньше то сообщение что массив меньше
     *
     * - заполнить массив числами фибоначчи
     */

    // 222 31 144 3 5 88 99 4 10
    /**
     * min 31
     * min2 222
     */
    public static void getMin(int[] arr) {
        int min = arr[0];
        int min2 = 0;

        //20
        for (int j : arr) {
            if (j <= min) {
                min2 = min; // 22
                min = j;  //11
            } else if (j > min && j < min2) {
                min2 = j;
            }
        }
        System.out.println("MIN 1: " + min);
        System.out.println("MIN 2: " + min2);
    }

    //todo
    private static int sumAlex(int[] arr) {
        int sum = 0;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] + arr[j];
            j--;
            if (i == j) return sum;
        }
        return sum;
    }

    //todo
    private static void sum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;

        while (start != end) {
            sum += arr[start] + arr[end];
            start++;
            end--;
        }

        if (start == end) {
            sum += arr[start];
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 10};

        getMin(arr);


    }
}

class Person {
    String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void doing() {
        System.out.println(m());
    }

    private static int m() {
        return 8;
    }
}

class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
    }
}