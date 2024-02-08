package thread_safe;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        final int numberOfThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads, () -> {
            System.out.println("CyclicBarrier here");
        });
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(() -> {
                try {
                    System.out.println("Thread " + Thread.currentThread().getName() + " is already running");
                    Thread.sleep(2000);
                    System.out.println("Thread " + Thread.currentThread().getName() + " is on the barrier");
                    barrier.await();
                    System.out.println("Поток " + Thread.currentThread().getName() + " продолжает выполнение.");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
            thread.start();


        }

    }
}
