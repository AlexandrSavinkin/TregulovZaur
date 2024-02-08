package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LowerCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        List<String> s = list.stream().map(String::toLowerCase).toList();
        System.out.println(s);
    }
}
