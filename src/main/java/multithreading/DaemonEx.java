package multithreading;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thread stopped");


    }

}

class UserThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon " + isDaemon());
        for (char i = 'A'; i <= 'j'; i++) {
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class DaemonThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Daemon " + isDaemon());
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}