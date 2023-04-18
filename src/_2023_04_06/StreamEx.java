//package _2023_04_06;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//import java.util.stream.Stream;
//
//public class StreamEx {
//    /**
//     * - создание стрима
//     * - че то делаем промежуточными
//     * - закрыть стрим терминальным оператором
//     */
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(new Random().nextInt(22));
//        }
//
//        int[] arr = {1, 2, 2, 22, 3, 6, 55, 47, 8, 9};
//        Arrays.stream(arr)
//                .filter(el -> {
//                    int i = 0;
//                    for (int j = 0; j < arr.length-1; j++) {
//                        if (el > 20) {
//                            i = el;
//                            break;
//                        }
//                    }
//                    return i;
//                }).forEach(System.out::println);
////
////        long s = Arrays.stream(arr)
////                .map(el -> {
////                    if(el % 2 == 0) {
////                        System.out.println(el);
////                    }
////                    return el;
////                })
////                .filter(el -> el > 10) 22-47-55
////                .count();
////
////        System.out.println(s);
//
//        // list.stream() collection
//        // Arrays.stream(arr) array
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 4, 4, 4, 5, 6);
////        long i = stream
////                .distinct()
////                .peek(System.out::println)
////                .count();
////
////        System.out.println(i);
//
//        Student s1 = new Student("Ivan", 9.5);
//        Student s2 = new Student("Petr", 8.5);
//        Student s3 = new Student("Elena", 7.5);
//        Student s4 = new Student("Anna", 6.5);
//        Student s5 = new Student("Pavel", 5.5);
//
//        Faculty IT = new Faculty("IT");
//        Faculty HR = new Faculty("HR");
//
//        IT.addToFaculty(s1);
//        IT.addToFaculty(s2);
//        IT.addToFaculty(s3);
//
//        HR.addToFaculty(s4);
//        HR.addToFaculty(s5);
//
//        List<Faculty> faculties = new ArrayList<>();
//        faculties.add(IT);
//        faculties.add(HR);
//
////        faculties.stream()
////                .flatMap(faculty -> faculty.getStudentList().stream())
////                .filter(el -> el.getAvgGrade() > 7)
////                .forEach(el -> System.out.println(el.getName() + " : " + el.getAvgGrade()));
//    }
//}
//
//@AllArgsConstructor
//@Getter
//@Setter
//class Student {
//    private String name;
//    private double avgGrade;
//}
//
//
//@Getter
//@Setter
//class Faculty {
//    private String name;
//    List<Student> studentList = new ArrayList<>();
//
//    public Faculty(String name) {
//        this.name = name;
//    }
//
//    public void addToFaculty(Student s) {
//        studentList.add(s);
//    }
//}
