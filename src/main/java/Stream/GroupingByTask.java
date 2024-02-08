package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTask {
    public static void main(String[] args) {
        // Создаем список людей
        List<Persons> people = List.of(
                new Persons("Sara", 4, "Norwegian"),
                new Persons("Viktor", 40, "Serbian"),
                new Persons("Eva", 42, "Norwegian")
        );

        // Группируем людей по национальности
        Map<String, List<Persons>> groupedByNationality = groupByNationality(people);

        // Выводим результаты группировки
        for (Map.Entry<String, List<Persons>> entry : groupedByNationality.entrySet()) {
            String nationality = entry.getKey();
            List<Persons> peopleWithNationality = entry.getValue();
            System.out.println("Nationality: " + nationality);
            System.out.println("People: " + peopleWithNationality);
            System.out.println();
        }
    }

    public static Map<String, List<Persons>> groupByNationality(List<Persons> people) {
        return people.stream().collect(Collectors.groupingBy(person -> person.getNationality()));
    }
}

class Persons {
    private final String name;
    private final int age;
    private final String nationality;

    public Persons(String name, int age, String nationality) {
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

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Nationality: " + nationality + ")";
    }
}