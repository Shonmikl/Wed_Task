public class Main {
    public void getMin(int[] arr) {

    }

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
        int[] arr = {1, 3, 6, 5, 4};

        sum(arr);
        System.out.println(sumAlex(arr));

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