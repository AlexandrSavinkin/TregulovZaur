package multithreading;

public class JustExam {
    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());
        producerThread.start();
        consumerThread.start();

    }

    static class Producer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Producer " + i);
                Thread.yield();
            }
        }
    }
    static class Consumer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Consumer " + i);
                Thread.yield();
            }
        }
    }
}