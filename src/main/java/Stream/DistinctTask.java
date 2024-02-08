package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctTask {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 6, 3, 8, 9, 9, 12, 13, 14, 15, 16, 17, 18, 15, 14, 16, 17, 18);
        System.out.println("Original numbers: " + numbers);

        List<Integer> uniqNums = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Without method: " + uniqNums);

        System.out.println("With method: " + getUniqNums(uniqNums));

    }

    public static List<Integer> getUniqNums(List<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }
}
