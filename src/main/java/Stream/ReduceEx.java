package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = calculate(integers);
        System.out.println(sum);

    }

    public static int calculate(List<Integer> numbers) {
        return numbers.stream().reduce((a, b) -> a + b).get();
//        return numbers.stream().reduce(Integer::sum).get();
    }
}
