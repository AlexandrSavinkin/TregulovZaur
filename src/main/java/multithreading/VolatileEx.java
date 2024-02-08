package multithreading;

public class VolatileEx extends Thread{
   volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished. Count = " + counter);
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds is it time to wake up. " );
        thread.b = false;
        thread.join();
        System.out.println("The end of the program");
    }


}
