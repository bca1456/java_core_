package extendsThreadExample;

public class CounterT extends Thread{
    private int currentValue;

    public CounterT(String threadName){
        super(threadName);
        currentValue = 0;
        System.out.println(this);
        start();
    }

    public int getCurrentValue() {
        return currentValue;
    }

    @Override
    public void run() {
        try{
            while(currentValue < 10){
                System.out.println(getName() + ": " + (currentValue++));
                Thread.sleep(250);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exit from thread: " + getName());
    }
}
