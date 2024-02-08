package yieldEx;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable one = new MyRunnable("one");
        MyRunnable two = new MyRunnable("--two");

        Thread th1 = new Thread(one);
        Thread th2 = new Thread(two);
        System.out.println("one -" + th1.getState() + " two -" + th2.getState());


        th1.start();
        th2.start();
        System.out.println("one - " + th1.getState() + " two - " + th2.getState());

        th2.join();
        th1.join();
        System.out.println("one -" + th1.getState() + " two -" + th2.getState());
        System.out.println("All threads finished !");

        th1.join();
        th2.join();

        System.out.println("The end!");

    }
}
