package extendsThreadWithSynchronizedCodeBlockExample;

public class CountingValue {
    public static Integer value = 1;

    public static void increaseValue(){
        synchronized (value) {
            value++;
        }
    }
}
