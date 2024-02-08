package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;


public class StudentInfo {

    void testStudent(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student student : al) {
            if (pr.test(student)) {
                System.out.println(student);
            }
        }
    }

}


class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 21, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();

        System.out.println("--------------------------------");
        info.testStudent(students, s -> s.age < 30);
        System.out.println("--------------------------------");
        info.testStudent(students, s -> s.avgGrade > 8);
        System.out.println("--------------------------------");
        info.testStudent(students, s -> s.avgGrade < 9.3 && s.age > 20 && s.sex == 'f');
    }
}

//interface StudentsChecks {
//    boolean check(Student s);
//}








