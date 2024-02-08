package multithreading;

public class SynchronizedEx1 {

    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
    void mobileColl() {
        synchronized (lock) {
            System.out.println("Mobile Coll starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile Coll ends");
        }
    }
    void skypeColl() {
        synchronized (lock) {
            System.out.println("Skype Coll starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype Coll ends");
        }
    }
    void whatsAppColl() {
        synchronized (lock) {
            System.out.println("WhatsApp Coll starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp Coll ends");
        }
    }
}
class RunnableImplMobile implements Runnable {

    @Override
    public void run() {
        new SynchronizedEx1().mobileColl();
    }
}
class RunnableImplSkype implements Runnable {

    @Override
    public void run() {
        new SynchronizedEx1().skypeColl();
    }
}
class RunnableImpWhatsApp implements Runnable {

    @Override
    public void run() {
        new SynchronizedEx1().whatsAppColl();
    }
}

class Car {

}