package MyEx;

public class DiningPhilosophers {
    private static final int NUM_PHILOSOPHERS = 5;
    private static final Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

    private static final Object[] forks = new Object[NUM_PHILOSOPHERS];


    public static void main(String[] args) {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Object();
        }
        for (int i = 0; i < NUM_PHILOSOPHERS; i++){
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % NUM_PHILOSOPHERS];
            philosophers[i] = new Philosopher(leftFork, rightFork);
            Thread thread = new Thread(philosophers[i]);
            thread.start();
        }
    }

    static class Philosopher implements Runnable {
        private final Object leftFork;
        private final Object rightFork;

        public Philosopher(Object leftFork, Object rightFork) {
            this.leftFork = leftFork;
            this.rightFork = rightFork;
        }

        private void doAction(String action) throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + " " + action);
            Thread.sleep((int) (Math.random() * 100));
        }


        @Override
        public void run() {
            try {
                while (true) {
                    doAction("thinking");
                    synchronized (leftFork) {
                        doAction("picked up left fork");
                        synchronized (rightFork) {
                            doAction("picked up right fork - eating");
                            doAction("put down right fork");
                        }
                        doAction("put down left fork");
                    }

                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

