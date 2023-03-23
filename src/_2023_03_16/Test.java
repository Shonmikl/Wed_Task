//package _2023_03_16;
//
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        Person P1 = new Person("Mikhail", "IT", 38, 11111);
//        Person P2 = new Person("Ivan", "HR", 28, 2555);
//        Person P3 = new Person("Petr", "IT", 30, 3333);
//        Person P4 = new Person("Elena", "HR", 25, 4444);
//        System.out.println(P1.hashCode());
//
//
////        List<Person> list = new ArrayList<>();
////
////        list.add(P1);
////        list.add(P2);
////        list.add(P3);
////        list.add(P4);
////
////        System.out.println(list);
////        System.out.println("-------------------------------");
////        Collections.sort(list, new AGEComparator());
////        System.out.println(list);
//    }
//}
//
//class AGEComparator implements Comparator<Person> {
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.getAge() - o2.getAge();
//    }
//}
