package MyEx;

import java.util.stream.IntStream;

public class PeekEx {
    public static void main(String[] args) {
        IntStream s = IntStream.of(1, 2, 3, 4);
        long count = s.peek(System.out::println).count();
//        System.out.println("count: " + count);
    }
}
