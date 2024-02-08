package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class PartitioningByTask {
    public static void main(String[] args) {
        People1 sara = new People1("Sara", 4,"USA");
        People1 viktor = new People1("Viktor", 40,"USA");
        People1 eva = new People1("Eva", 42,"USA");
        List<People1> collection = asList(sara, eva, viktor);
        System.out.println(partitionAdults(collection));
    }

    public static Map<Boolean, List<People1>> partitionAdults(List<People1> people) {
        return people.stream().collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
    }

}
class People1 {
    private final String name;
    private final int age;
    private final String nationality;

    public People1(String name, int age, String nationality) {
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