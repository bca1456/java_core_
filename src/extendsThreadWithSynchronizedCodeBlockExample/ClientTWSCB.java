package extendsThreadWithSynchronizedCodeBlockExample;

import helpers.TimeHelper;

import java.util.ArrayList;
import java.util.List;

public class ClientTWSCB {
    public void getExample() {
        try {
            TimeHelper.startTime = System.currentTimeMillis(); //время старта
            List<CounterTWSCB> threadList = new ArrayList<>(); //лист потоков
            for (int i = 0; i < 2; i++) {
                CounterTWSCB thread = new CounterTWSCB(String.valueOf(i)); //создаем поток
                threadList.add(thread); //добавляем в лист
            }

            for (CounterTWSCB thread : threadList) {
                thread.start(); //стартуем каждый
            }

            for (CounterTWSCB thread : threadList) {
                thread.join(); //ждем пока каждый завершится
            }
            TimeHelper.endTime = System.currentTimeMillis(); //время конца
            System.out.println(TimeHelper.getRangeInSeconds()); //выводим время работы проги в секундах
            System.out.println("Exit from main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
