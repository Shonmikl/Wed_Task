package _2023_03_16;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private String name;
    private String department;
    private Integer age;
    private int salary;

    @Override
    public int compareTo(Person p2) {
      // return this.salary == p2.salary ? this.age - p2.age : this.salary - p2.salary;
      //  return this.department.compareTo(p2.department);
        return this.salary == p2.salary ? this.department.compareTo(p2.department) : this.salary - p2.salary;
    }
    //obj1.compareTo(obj2)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return salary == person.salary
                && Objects.equals(department, person.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, salary);
    }
}