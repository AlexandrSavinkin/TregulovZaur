package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                call.mobileColl();
            }
        });
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                call.skypeColl();
            }
        });
        Thread thread3 = new Thread(new Runnable() {

            @Override
            public void run() {
                call.whatsAppColl();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
    class Call{
        private Lock lock = new ReentrantLock();

        void mobileColl() {
            lock.lock();
            try {
                System.out.println("Mobile Coll started");
                Thread.sleep(3009);
                System.out.println("Mobile Coll ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        }
        void skypeColl() {
            lock.lock();
            try {
                System.out.println("Skype Coll started");
                Thread.sleep(3009);
                System.out.println("Skype Coll ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        }
        void whatsAppColl() {
            lock.lock();
            try {
                System.out.println("WhatsApp Coll started");
                Thread.sleep(7009);
                System.out.println("WhatsApp Coll ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        }
    }

