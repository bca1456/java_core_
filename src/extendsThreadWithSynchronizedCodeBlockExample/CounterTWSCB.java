package extendsThreadWithSynchronizedCodeBlockExample;

public class CounterTWSCB extends Thread{
    public CounterTWSCB(String threadName){
        super(threadName);
//        System.out.println(this);
    }

    @Override
    public void run() {
        while(CountingValue.value < 50000){
            if (CountingValue.value % 2 == 0){
                ValueList.evenNumbersList.add(CountingValue.value);
            }
            System.out.println(getName() + ": " + CountingValue.value); //выводим имя потока и значение на данный момент
            CountingValue.increaseValue(); //увеличиваем значение
        }
        System.out.println("Exit from thread: " + getName());
    }
}
