package Stream;

import java.util.Arrays;

public class Test3ForEach {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(element -> {element *= 2; System.out.println(element);});
        System.out.println("================================================");
        Arrays.stream(array).forEach(Util::myMethod);
//        Arrays.stream(array).forEach(element -> Util.myMethod(element));


    }
}
class Util{
    public static void myMethod(int index) {
        index += 10;
        System.out.println("Element = " + index + "");
    }
}
