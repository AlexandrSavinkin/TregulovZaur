package Stream;

import java.util.stream.Stream;

public class Test7distinct {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7,1,2,4,5);

        //===============distinct======================
//    stream.distinct().forEach(System.out::println); -  работает

        //===============count======================
//       System.out.println(stream.count());
//        Стримы нельзя переиспользовать!!!!
//        System.out.println(stream.distinct().count());

        //==============PEEK===============
        //работает как forEach только промежуточный, можно просмотреть объекты
        System.out.println(stream.distinct().peek(System.out::println).count());


    }
}
