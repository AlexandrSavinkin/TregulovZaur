package JoinExample;

public class Thread_Join {
    static class JoinThread extends Thread {

        public JoinThread(String name) {
            super(name);
        }
        public void run() {
            try {
            String nameT = getName();
            long timeout = 0;
            System.out.println("Starting thread " + nameT);
            switch (nameT) {
                case "First":
                    timeout = 5_000;
                    break;
                    case "Second":
                        timeout = 1_000;
            }

                Thread.sleep(timeout);
                System.out.println("Thread hello " + nameT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }
}
