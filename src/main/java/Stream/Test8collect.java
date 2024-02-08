package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8collect {
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
        //===============groupingBy=======================
//       Map<Integer,List<Student>> listMap = students.stream().map(el -> {
//            el.setName(el.getName().toUpperCase());
//            return el;
//        }).collect(Collectors.groupingBy(el-> el.getCourse()));
//
//       for (Map.Entry<Integer,List<Student>> entry : listMap.entrySet()) {
//           System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//       }

        //===================partitionBy================
//
//        Map<Boolean, List<Student>> listMap = students.stream()
//                .collect(Collectors.partitioningBy(student -> student.getAvgGrade() > 7));
//        for (Map.Entry<Boolean, List<Student>> entry : listMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());

        //==================findFirst================

        Student first = students.stream().map(e ->
                {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first);


    }


}
