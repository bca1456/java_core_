import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SS {
    public static void getSS(){
        System.out.println("SortedSet");
        Set<Integer> ss = new TreeSet<>();
        ss.add(1);
        ss.add(-4);
        ss.add(-5);
        ss.add(666);
        ss.add(-777);
        System.out.println("ss " + ss);
        ss.removeIf(i -> i == -777);
        System.out.println("ss " + ss);

        Set<Integer> ss1 = new TreeSet<>(new IntComparator());
        ss1.add(1);
        ss1.add(-4);
        ss1.add(-5);
        ss1.add(666);
        ss1.add(-777);
        System.out.println("ss1 " + ss1);
        System.out.println("ss1 iterator: " + ss1.iterator());
        System.out.println("End of SortedSet");
    }
}

class IntComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}