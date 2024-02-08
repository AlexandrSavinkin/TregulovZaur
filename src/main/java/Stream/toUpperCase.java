package Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class toUpperCase {
    public static void main(String[] args) {
        Collection<String> namesUpperCase = mapToUpperCase("John", "Doe", "Alice");
        System.out.println(namesUpperCase.size() + " " + namesUpperCase);

    }

    public static Collection<String> mapToUpperCase(String... names) {
//        return Arrays.stream(names).map((n) -> n.toUpperCase()).collect(Collectors.toList());
        return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
    }


}
