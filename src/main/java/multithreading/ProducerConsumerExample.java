package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    private static final int BUFFER_SIZE = 5;
    private static final int NUM_PRODUCERS = 2;
    private static final int NUM_CONSUMERS = 3;

    private static final Queue<Integer> buffer = new LinkedList<>();

    public static void main(String[] args) {
        Thread[] producers = new Thread[NUM_PRODUCERS];
        Thread[] consumers = new Thread[NUM_CONSUMERS];

        for (int i = 0; i < NUM_PRODUCERS; i++) {
            producers[i] = new Thread(new Producer());
            producers[i].start();
        }

        for (int i = 0; i < NUM_CONSUMERS; i++) {
            consumers[i] = new Thread(new Consumer());
            consumers[i].start();
        }

    }
    static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (buffer) {
                        while (buffer.size() == BUFFER_SIZE) {
                            buffer.wait();
                        }
                        int data = produceData();
                        buffer.add(data);
                        System.out.println("Producer produced: " + data);
                        buffer.notifyAll();
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        private int produceData() {
            // Генерация данных
            return (int) (Math.random() * 100);
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (buffer) {
                        while (buffer.isEmpty()) {
                            buffer.wait();
                        }
                        int data = buffer.poll();
                        System.out.println("Consumer consumed: " + data);
                        buffer.notifyAll();
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}