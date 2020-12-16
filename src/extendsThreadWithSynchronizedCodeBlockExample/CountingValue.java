package extendsThreadWithSynchronizedCodeBlockExample;

public class CountingValue {
    public static Integer value = 0;

    public static void increaseValue(){
        synchronized (value) {
            value++;
        }
    }
}
