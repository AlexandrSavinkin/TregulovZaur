package MyEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolEx{
    public static void main(String[] args) {
        // Создание исполнительного сервиса с фиксированным пулом из 3 потоков
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Подача задач на выполнение
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executorService.execute(() -> {
                System.out.println("Выполняется задача " + taskId + " в потоке " + Thread.currentThread().getName());
            });
        }

        // Завершение работы исполнительного сервиса
        executorService.shutdown();
    }
}