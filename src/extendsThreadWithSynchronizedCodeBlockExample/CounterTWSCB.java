package extendsThreadWithSynchronizedCodeBlockExample;

public class CounterTWSCB extends Thread{
    public CounterTWSCB(String threadName){
        super(threadName);
        System.out.println(this);
    }

    @Override
    public void run() {
        while(CountingValue.value < 50000){
            System.out.println(getName() + ": " + CountingValue.value);
            CountingValue.increaseValue();
        }
        System.out.println("Exit from thread: " + getName());
    }
}
