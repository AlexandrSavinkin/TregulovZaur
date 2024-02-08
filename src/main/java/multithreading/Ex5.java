package multithreading;

public class Ex5 implements Runnable{

    @Override
    public void run() {
        System.out.println("Method run. Thread name1: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Ex5());
        t.start();
        System.out.println("Method run. Thread name: " + Thread.currentThread().getName());
    }
}

