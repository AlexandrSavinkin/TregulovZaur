package JoinExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting main thread");
        Thread_Join.JoinThread joinThread1 = new Thread_Join.JoinThread("First1");
        Thread_Join.JoinThread joinThread2 = new Thread_Join.JoinThread("Second");
        joinThread1.start();
        joinThread2.start();
        try {
            joinThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());

    }
}
