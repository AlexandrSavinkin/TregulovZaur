package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test10minMax {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 21, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        //===============min() and max()========================
        Student min = students.stream().min((x,y)-> x.getAge() - y.getAge()).get();
        System.out.println(min);
        Student max = students.stream().max((x,y)-> x.getAge() - y.getAge()).get();
        System.out.println(max);

        //===============limit() and skip()========================
//        students.stream().filter(student -> student.getAge() < 30).forEach(System.out::println);
//        System.out.println("================================================");
//        students.stream().filter(student -> student.getAge() < 30).limit(2).forEach(System.out::println);
//        System.out.println("================================================");
//        students.stream().filter(student -> student.getAge() < 30).skip(2).forEach(System.out::println);
    }
}
