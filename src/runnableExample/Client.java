package runnableExample;

public class Client {
    public void getRunnableExample() {
        Counter counterA = new Counter(); //создаем объект класса счетчика
        Thread worker = new Thread(counterA, "CounterA"); //создаем новый дочерний поток
        System.out.println(worker); //выводим инфу о созданном потоке

        worker.start();  //начинаем работу потока

        try{
            int value;
            do {
                value = counterA.getCurrentValue();  // получаем текущее значение
                System.out.println("Counter value read by: " + Thread.currentThread().getName() +
                        ": " + value);  //получаем имя потока, прочитавшего значение и само значение
                Thread.sleep(1000); //отправляем текущий поток спать
            } while (value < 10);
        } catch (InterruptedException e) {
            System.out.println("The main Thread is interrupted");
            e.printStackTrace();
        }
        System.out.println("Exit from main method");
    }
}
