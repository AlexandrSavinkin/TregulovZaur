package Stream;

import java.util.Arrays;
import java.util.List;

public class TaskFilterStream {
    public static void main(String[] args) {
        List<Integer> tasks = Arrays.asList(1, 2, 3, 4, 74, 9, 12, 13, 14);
        System.out.println(sum(tasks));
        int sumNumber = tasks.stream().filter(task -> task % 2 == 1).mapToInt(Integer::intValue).sum();
        System.out.println(sumNumber);
    }

    public static int sum(List<Integer> tasks) {
        return tasks.stream().filter(task -> task % 2 == 0).mapToInt(Integer::intValue).sum();
    }
}