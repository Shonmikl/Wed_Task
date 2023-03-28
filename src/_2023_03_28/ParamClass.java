package _2023_03_28;

import _2023_03_16.Cat;
import _2023_03_16.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;

public class ParamClass {
    public static void main(String[] args) {

//        Inter<String> inter = new Inter<>("!!!!!");
//        System.out.println(inter);
//        String s = inter.getValue();
//        System.out.println(s);

        Doub<String, Person> doub = new Doub<>("P", new Person
                ("name", "de", 55, 5555, new Cat()));
        System.out.println(doub.getValue1());
        System.out.println(doub.getValue2());
    }
}

class METH {
    public static <T> T getSmth(ArrayList<T> al) {
        return al.get(0);
    }
}

class Inter<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public Inter(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Inter{" +
                "value=" + value +
                '}';
    }
}

class Doub<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Doub(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Doub{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

interface M<U> {

}