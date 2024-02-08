package multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

    public static void main(String[] args) throws InterruptedException {
//        HashMap<Integer,String> map = new HashMap<>();
        ConcurrentHashMap<Integer, String > map = new  ConcurrentHashMap<>();
        map.put(1, "Alex");
        map.put(2, "Smith");
        map.put(3, "Peter");
        map.put(4, "Sofia");
        map.put(5, "Olivia");
        System.out.println(map);

        Runnable run1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));


            }
        };
        Runnable run2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Elena");
            map.put(4, "David");
        };
        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);

    }
}
