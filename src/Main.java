import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello world!")).start();
    }

    static int kek(String a){
        return Integer.parseInt(a);
    }
}


