import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LHS {
    public static void getLHS(){
        System.out.println("LinkedHashSet");
        Set<Character> s2 = new LinkedHashSet<Character>(8);
        Collections.addAll(s2, 'a', 'b', 'j');
        // iterators of a LinkedHashSet return their elements in proper order:
        assert s2.toString().equals("[a, b, j]"):"qwe"; //=> added letters saved by their init order
        System.out.println("End of LinkedHashSet");
    }
}
