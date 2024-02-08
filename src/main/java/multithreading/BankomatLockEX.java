package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankomatLockEX {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Alexander", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        new Employee("Victor", lock);
        Thread.sleep(5000);
        new Employee("Marina", lock);
        new Employee("Zaur", lock);
    }


}

class Employee extends Thread {

    String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + "...waiting for");
//            lock.lock();
                System.out.println(name + "...used the bankomat");
                Thread.sleep(2000);
                System.out.println(name + "...finished his deal");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + "...dont wont to wait");
        }
    }

}