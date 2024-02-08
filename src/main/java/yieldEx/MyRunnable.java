package yieldEx;

public class MyRunnable implements Runnable {
    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " is run loop " + i);
            try {
                Thread.sleep(1000);
                Thread.yield();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }

        }

    }
}
