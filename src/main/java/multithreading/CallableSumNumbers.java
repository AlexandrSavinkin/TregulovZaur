package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableSumNumbers {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futuresResult = new ArrayList<>();
        long valueDevidedBy10 = value / 10;
        for (long i = 0; i < 10; i++) {
            long from = valueDevidedBy10 * i + 1;
            long to = valueDevidedBy10 *( i + 1);
            PertialSum task = new PertialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            futuresResult.add(futurePartSum);
        }
        for(Future<Long> result : futuresResult) {
            sum += result.get();

        }
        executorService.shutdown();
        System.out.println(sum);

    }

}


class PertialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PertialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}