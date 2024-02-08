package MyEx;

public class PowerOfEx {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        boolean result = isPowerOf(a, b);
        System.out.println(result);

    }

//    public static boolean isPowerOf(int a, int b) {
//        if (b == 1) {
//            return true;
//        }
//        if (b % a != 0) {
//            return false;
//        }
//        return isPowerOf(a, b / a);
//    }
    public static boolean isPowerOf(int a, int b) {
        if (b == 0) {
            return false;
        }
        while (b % a == 0) {
            b /= a;
        }
        return b == 1;
    }
}
