package Stream;

import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
    public static void main(String[] args) {
        List<Persons> people = List.of(
                new Persons("John", 23, "USA"),
                new Persons("Alexander", 39, "Russia"),
                new Persons("Alice", 30, "Canada")
        );
        Persons bestPerson = getBestPerson(people);
        System.out.println(bestPerson.getName());
    }

    public static Persons getBestPerson(List<Persons> people) {
        return people.stream()
                .max(Comparator.comparingInt(Persons::getAge))
//                .max(Comparator.comparingInt(p -> p.getAge()))
                .orElse(new Persons("", 0,""));
    }

}

class Person {
    private final String name;
    private final int age;
    private final String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
}
