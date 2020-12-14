import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TS {
    public static void getTS(){
        System.out.println("TreeSet");
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("qwe");
        sortedSet.add("ewq");
        sortedSet.add("eqw");
        sortedSet.add("wqe");
        System.out.println(sortedSet);

        SortedSet<String> sortedSet1 = new TreeSet<>(new TSComparator());
        sortedSet1.add("qwe");
        sortedSet1.add("ewq");
        sortedSet1.add("eqw");
        sortedSet1.add("wqe");
        System.out.println(sortedSet1);

        System.out.println("subSet " + sortedSet1.subSet("qwe", "eqw"));  //getting set from element "qwe" to "eqw"
        System.out.println("tailSet " + sortedSet1.tailSet("qwe"));  //gettin tailset from element
        System.out.println("headSet " + sortedSet1.headSet("qwe"));  //getting headset from element
        System.out.println("first elem " + sortedSet1.first());
        System.out.println("last elem " + sortedSet1.last());
        System.out.println("End of TreeSet");
    }
}
class  TSComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
