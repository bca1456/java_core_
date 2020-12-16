package runnableExample;

public class Counter implements Runnable{
    private int currentValue;

    public Counter() {
        this.currentValue = 0;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    @Override
    public void run() {   //код, который юзается для потока
        try{
            while (currentValue < 10){     // пока значение < 10
                System.out.println(
                        Thread.currentThread().getName() + ": " + (currentValue++) //выводим имя потока и прибавляем
                );
                Thread.sleep(250);  //отправляем текущий поток спать
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
            e.printStackTrace();
        }
        System.out.println("Exit from thread: " + Thread.currentThread().getName());
    }
}
