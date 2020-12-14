import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public <T> ArrayList<T> getBoundArray(T... a){
        return new ArrayList<T>(Arrays.asList(a));
    }
}
