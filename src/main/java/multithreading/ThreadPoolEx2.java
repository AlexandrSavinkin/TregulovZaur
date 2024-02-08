package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            service.execute(new RunnableImpl200());
//        }
//        service.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
//        service.shutdown();

//        service.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new RunnableImpl200(),3,1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        service.shutdown();
    }

}

class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin work ");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " end work ");
    }
}