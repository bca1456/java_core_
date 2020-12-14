import java.util.Comparator;
import java.util.EnumSet;
import java.util.Set;

public class ES {
    enum Words {QAZ, QWE, FDS, CVB}

    public static void getES(){
        System.out.println("EnumSet");
        EnumSet<Words> set = EnumSet.allOf(Words.class);
        System.out.println(set);
        System.out.println("End of EnumSet");
    }
}
