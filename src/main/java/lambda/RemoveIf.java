package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("World");
        al.add("OK");
        al.add("Learn Java");
//        al.removeIf(element -> element.length() < 5);
        Predicate<String> predicate = element -> element.length() < 5;
        al.removeIf(predicate);
        System.out.println(al);

    }
}
