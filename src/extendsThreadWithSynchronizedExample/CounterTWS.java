package extendsThreadWithSynchronizedExample;

public class CounterTWS extends Thread{

    public CounterTWS(String threadName){
        super(threadName);
        System.out.println(this);
        start();
    }

    @Override
    public void run() {
        while(CountingValue.value < 50){
            System.out.println(getName() + ": " + CountingValue.value);
            CountingValue.increaseValue();
        }
        System.out.println("Exit from thread: " + getName());
    }
}
