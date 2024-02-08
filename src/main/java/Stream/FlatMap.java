package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("a", "b", "c"),
                List.of("d", "e", "f"),
                List.of("g", "h", "i")
        );
        List<String> flatMap = transform(list);
        System.out.println(flatMap);
    }
    public static List<String>transform(List<List<String>> collection) {
        return collection.stream()
//                .flatMap(sublist-> sublist.stream())
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
