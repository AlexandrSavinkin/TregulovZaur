package multithreading;

public class InterruptedEx2 {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread threadClock = new Thread(clock);
        threadClock.start();
        Thread.sleep(10000);
        threadClock.interrupt();

    }
}
class Clock implements Runnable {

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("TAK");
               current.interrupt();
            }
            System.out.println("Tik");
        }
    }
}
