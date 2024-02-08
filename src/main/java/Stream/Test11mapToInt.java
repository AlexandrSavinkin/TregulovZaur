package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test11mapToInt {
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

        List<Integer> courses = students.stream()
                .mapToInt(Student::getCourse)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        int sum = students.stream().mapToInt(Student::getCourse).sum();
        System.out.println(sum);

        int min = students.stream().mapToInt(Student::getCourse).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(Student::getCourse).max().getAsInt();
        System.out.println(max);

        double average = students.stream().mapToDouble(Student::getCourse).average().getAsDouble();
        System.out.println(average);
    }
}
