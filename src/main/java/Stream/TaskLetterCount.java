package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TaskLetterCount {


    public static void main(String[] args) {
       int toInt = getTotalNumberOfLettersOfNamesLongerThanFive("Daniel", "Violin", "Kris", "Lucas", "Aladdin", "Lord");
        System.out.println(toInt);
  ;

    }
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
       return Arrays.stream(names).filter(n -> n.length() > 5)
                .mapToInt(String::length)
//                .mapToInt(n - > n.length())
                .sum();
    }
}
