package Stream;

import java.util.stream.Stream;

public class Test6Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of( 1, 2, 3, 4, 5,1,2,3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5 );
        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10, 11);
        Stream<Integer> stream4 = Stream.concat(stream3, stream2);
        stream4.forEach(System.out::println);
    }
}
//метод concat(), не пренадлежит ни к одоной группе методов Stream API