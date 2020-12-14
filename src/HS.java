import java.util.HashSet;
import java.util.Set;

public class HS {
    public static void getHS(){
        System.out.println("HashSet");
        //create new hashet + adding element
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(-0);
        System.out.println(integerSet); //output by increase
        for (Integer elem: integerSet) {
            System.out.print(" " + elem.hashCode()); //output hashcodes
        }
        System.out.println();
        Integer[] ints = {};
        ints = integerSet.toArray(new Integer[integerSet.size()]);
        for (int a:ints) {
            System.out.print(" " + a);
        }

        System.out.println();

        //rehash after 3 addings
        Set<Integer> integerSet1 = new HashSet<>(1,3);
        integerSet1.add(3);
        integerSet1.add(1);
        integerSet1.add(2);
        integerSet1.add(-0);
        System.out.println(integerSet1); //output by increase
        for (Integer elem: integerSet1) {
            System.out.print(" " + elem.hashCode()); //output hashcodes
        }
        System.out.println();
        System.out.println("End of HashSet");
    }
}
