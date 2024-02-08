package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample2 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Create a producer
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int data = produceData();
                    queue.put(data);
                    System.out.println("Producer produced: " + data);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producerThread.start();
        // Создание и запуск потребителя
        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int data = queue.take();
                    consumeData(data);
                    System.out.println("Consumer consumed: " + data);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        consumerThread.start();
    }

    private static int produceData() {
        // Генерация данных
        return (int) (Math.random() * 100);
    }

    private static void consumeData(int data) {
        // Обработка данных
        System.out.println("Consuming: " + data);
    }
}