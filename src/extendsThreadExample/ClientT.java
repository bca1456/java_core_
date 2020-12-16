package extendsThreadExample;

public class ClientT {
    public void getExample(){
        System.out.println("Current thread: " + Thread.currentThread().getName());

        CounterT counter1 = new CounterT("Counter A");
        CounterT counter2 = new CounterT("Counter B");

        System.out.println("Exit from main");
    }
}
