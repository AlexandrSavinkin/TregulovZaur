package multithreading;

public class Ex7 extends Thread{

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Ex7 thread2 = new Ex7();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Finish");

    }
    public void run() {
        for (int i = 10; i > 0; i--){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}