package multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Поток выполняется");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван");
            }
        });

        myThread.start();

        // Позволим потоку выполняться в течение 5 секунд
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Прерываем поток
        myThread.interrupt();
    }
}