package Stream;


import java.util.List;
import java.util.stream.Collectors;

public class ChallengeEX {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 45, 87, 34, 7, 100);
        System.out.println(getString(numbers));

    }

    public static String getString(List<Integer> numbers) {
        return numbers.stream().map(n -> (n % 2 == 0 ? "e" : "o")+n).collect(Collectors.joining(","));
    }
}
