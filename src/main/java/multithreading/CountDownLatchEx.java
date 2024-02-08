package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff on place");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everyThingOllReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready so let's open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());

    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());

    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("Alice", countDownLatch);
        new Friend("Bob", countDownLatch);
        new Friend("Mary", countDownLatch);
        new Friend("Sofi", countDownLatch);
        new Friend("Alex", countDownLatch);

        marketStaffOnPlace();
        everyThingOllReady();
        openMarket();



    }

}

class Friend extends Thread {
    String name;
    CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " start buy");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}