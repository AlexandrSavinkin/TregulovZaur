package Stream;

import java.util.Arrays;
import java.util.List;

public class AverageNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        double avg = list.stream()
//                .mapToDouble(Integer::doubleValue)
//                .average().orElse(0.0);
//        System.out.println("Average items: " + avg);
        System.out.println(doubles(list));
    }
    public static double doubles(List<Integer> list) {
        return list.stream().mapToDouble(num -> num.doubleValue()).average().orElse(0.0);
    }
}
