import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //new Thread(() -> System.out.println("Hello world!")).start();
        String a1 = "qqq";
        String a2 = "qqww";
        Q q;
        q = (o1, o2) -> {
            if (o1.length() > o2.length()) return o1;
            else if(o1.length() == o2.length()) return "ravno";
            else return o2;
        };
        System.out.println(q.comp(a1, a2));
    }
}


