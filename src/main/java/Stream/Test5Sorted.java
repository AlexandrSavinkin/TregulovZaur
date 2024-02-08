package Stream;

import java.util.Arrays;

public class Test5Sorted {
    public static void main(String[] args) {
        int[] array = {7, 9, 3, 23, 12,  83,  67,  11, 23};
        int result = Arrays.stream(array).filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 2 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);

    }
}
