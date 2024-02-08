package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(7);
        //reduce - Optional<T>
        int result = list.stream()
                .reduce((accumulator, element) -> accumulator * element)
                .get();
        System.out.println(result);
        // 4,6,1,2,7
        // accumulator = 4 24 24 48 = 366
        //               *  *  *  *
        //     element = 6  1  2  7
        System.out.println("====================");
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // null не будут есть начальное значение
        int result2 = list.stream()
                .reduce(1,(accumulator, element) -> accumulator * element);
        System.out.println(result2);
        System.out.println("====================");
        // 4,6,1,2,7
        // accumulator = 1 4 24  48 = 366
        //               *  *  *  *
        //     element = 4  6  2  7


        List<String> list1 = new ArrayList<>();
        list1.add("hello world");
        list1.add("James");
        list1.add("Java");
        list1.add("Privet");
        list1.add("OK");
        String result1 = list1.stream().reduce((accumulator, element) -> accumulator + " " + element).get();
        System.out.println(result1);
//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list.stream().reduce((accumulator, element) -> accumulator * element);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        }else {
//            System.out.println("Not Present");
//        }


    }
}
