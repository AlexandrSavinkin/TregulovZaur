package multithreading;

public class Ex4 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        MyThread51 myThread51 = new MyThread51();
        myThread51.setName("myThread51");
        myThread51.setPriority(Thread.MAX_PRIORITY);
        myThread5.setName("Thread++");
        myThread5.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Names of myThread51 = " + myThread51.getName() + " Priority of myThread5 = " + myThread51.getPriority());
        System.out.println("Names of myThread5 = " + myThread5.getName() + " Priority of myThread5 = " + myThread5.getPriority());

    }

}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Поток5");
    }
}
class MyThread51 extends Thread {
    public void run() {
        System.out.println("Поток51");
    }
}