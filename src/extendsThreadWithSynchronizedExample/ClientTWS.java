package extendsThreadWithSynchronizedExample;


public class ClientTWS {
    public void getExample(){
        System.out.println("Current thread: " + Thread.currentThread().getName());

        CounterTWS counter1 = new CounterTWS("Counter A");
        CounterTWS counter2 = new CounterTWS("Counter B");
        CounterTWS counter3 = new CounterTWS("Counter C");
        CounterTWS counter4 = new CounterTWS("Counter D");

        System.out.println("Exit from main");
    }
}
