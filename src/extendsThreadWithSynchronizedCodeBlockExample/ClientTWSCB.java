package extendsThreadWithSynchronizedCodeBlockExample;

import helpers.TimeHelper;

import java.util.ArrayList;
import java.util.List;

public class ClientTWSCB {
    public void getExample() {
        try {
            TimeHelper.startTime = System.currentTimeMillis();
            System.out.println("Current thread: " + Thread.currentThread().getName());
            List<CounterTWSCB> threadList = new ArrayList<>();
            for (int i = 0; i < 25; i++) {
                CounterTWSCB thread = new CounterTWSCB(String.valueOf(i));
                threadList.add(thread);
            }

            for (CounterTWSCB thread : threadList) {
                thread.start();
            }

            for (CounterTWSCB thread : threadList) {
                thread.join();
            }
            TimeHelper.endTime = System.currentTimeMillis();
            System.out.println(TimeHelper.getRangeInSeconds());
            System.out.println("Exit from main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
