package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("John", callBox);
        new Person("Alice", callBox);
        new Person("Bob", callBox);
        new Person("Alex", callBox);
        new Person("Sofi", callBox);
    }
}

class Person extends Thread {
    String name;
    private final Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {

        try {
            System.out.println(name + "...waiting phone");
            callBox.acquire();
            System.out.println(name + "...use the phone ");
            Thread.sleep(2000);
            System.out.println(name + "...stop the call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }

    }
}
