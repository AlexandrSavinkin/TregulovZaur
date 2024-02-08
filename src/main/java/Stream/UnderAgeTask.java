package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class UnderAgeTask {
    public static void main(String[] args) {
        Person1 sara = new Person1("Sara", 4,"USA");
        Person1 viktor = new Person1("Viktor", 40,"Russia");
        Person1 eva = new Person1("Eva", 42,"Spain");
        Person1 anna = new Person1("Anna", 5,"Brazil");
        List<Person1> people = new ArrayList<>();
        people.add(viktor);
        people.add(sara);
        people.add(eva);
        people.add(anna);
        System.out.println(getKidNames(people));
    }
    public static Set<String> getKidNames(List<Person1> people){
        return people.stream().filter(person1 -> person1.getAge()<18).map(Person1::getName).collect(Collectors.toSet());
    }

}
class Person1 {
    String name;
    int age;
    String nationality;

    public Person1(String name, int age, String nationality) {
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