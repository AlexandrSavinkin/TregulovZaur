package lambda;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("hello world", "world", "java", "love");
        list.forEach(System.out::println);
    }
}
