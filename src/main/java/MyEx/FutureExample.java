package MyEx;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int num = 5;
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
                Thread.sleep(3000);
            }
            return factorial;
        });
        System.out.println("Выполняется асинхронная операция...");

        // Дожидаемся завершения операции и получаем результат
        int result = future.get();

        System.out.println("Результат: " + result);

        executor.shutdown();
    }
}
