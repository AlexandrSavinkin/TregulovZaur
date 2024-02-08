package lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Привет!!!"));

    }

    public static void main(String[] args) {
        def((String str) ->  str.length());

    }

    interface I {
        int abc(String s);
    }
}
