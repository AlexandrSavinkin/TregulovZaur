package multithreading;

public class Ex3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        }).start();

        new Thread(()-> System.out.println("Привет!")).start();
        new Thread(()-> System.out.println(1)).start();
    }
}
