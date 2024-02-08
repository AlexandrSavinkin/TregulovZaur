package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello world");
        list.add("James");
        list.add("Java");
        list.add("Privet");
        list.add("OK");

        List<Integer> list2 = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("++++++++++++++++++++++");
        System.out.println(list2);
        System.out.println("++++++++++++++++++++++");
        System.out.println(list2.size());
        System.out.println("++++++++++++++++++++++");
        int[] array = {6, 3, 8, 9, 10, 11, 12, 13, 14, 15, 16,24};
       array = Arrays.stream(array).map(element ->
        {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("++++++++++++++++++++++");


        Set<String> set = new TreeSet<>();
        set.add("hello world");
        set.add("James");
        set.add("Java");
        set.add("Privet");
        set.add("OK");
        System.out.println(set);
        System.out.println("++++++++++++++++++++++");

        Set<Integer> set1 = set.stream().map(String::length).collect(Collectors.toSet());
       List<Integer> set2 = set.stream().map(String::length).collect(Collectors.toList());
        System.out.println(set1);
        System.out.println(set2);
    }

}
