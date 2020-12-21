package helpers;

import java.util.ArrayList;
import java.util.List;

public class ThreadHelper {
    public static List<Thread> getListOfThreads(Runnable listOperations, int number){
        List<Thread> threads = new ArrayList<>();

        try {
            for (int i = 0; i < number; i++) {
                Thread thread = new Thread(listOperations, String.valueOf(i));
                threads.add(thread);
            }

            for (Thread t : threads) {
                t.start();
            }

            for (Thread t : threads) {
                t.join();
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return threads;
    }
}
