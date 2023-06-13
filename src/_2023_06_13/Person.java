package _2023_06_13;

import java.lang.annotation.*;
import java.util.Objects;

@Dep
@Phone(OS = "IOS")
public class Person {

    @Dep
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Deprecated
    void get(@Dep String name) {
        System.out.println(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class samsung = Class.forName("_2023_06_13.SAMSUNG");
        Annotation annotation = samsung.getAnnotation(Phone.class);
        Phone sss = (Phone) annotation;
        System.out.println(sss.issue() + " : " + sss.OS());
    }
}

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface Dep {

}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Phone {
    String OS() default "";
    int issue() default 2023;
}

@Phone(OS = "ANDROID", issue = 2021)
class SAMSUNG {
    String model;
    double price;
}