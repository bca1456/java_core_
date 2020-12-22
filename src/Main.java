import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        final Collection<String> stringCollection= new HashSet<>();
        stringCollection.add("1");
        stringCollection.add("2");
        stringCollection.add("3");
        Iterator i = stringCollection.iterator();
        i.remove();
        System.out.println(stringCollection);
    }

}


