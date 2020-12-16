package extendsThreadWithSynchronizedExample;

public class CountingValue {
    public static int value = 0;

    public static synchronized void increaseValue(){
        value++;
    }
}
