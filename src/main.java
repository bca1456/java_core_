import sun.reflect.generics.tree.Tree;

import java.text.Collator;
import java.util.*;

public class main {
    public static void main(String[] args){
        /*Person<String, Integer> person1 = new Person<>("Syarhei", 21);
        System.out.println(person1);
        Person<String, Integer> person2 = new Person<>("e",12);
        System.out.println(person2);
        Example example = new Example();
        ArrayList<Object> q = example.getBoundArray(12, "3213", "sdfdsf", false, -12);
        //System.out.println(q);
        for (Object w:q) {
            System.out.println(w);
        }

        int total = 0;
        for (int i : new Counter(3)) {
            total += i;
        }
        assert total == 6;*/
        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1,"qwe");
        testMap.put(2,"rty");
        System.out.println(testMap);
        testMap.put(1, "qaz");
        System.out.println(testMap);
        /*System.out.println(testMap.hashCode() + " " + testMap.get(1).hashCode() +
                " " + testMap.get(2).hashCode());*/
        Map<Integer, String> inheritedMap = new HashMap<>();
        inheritedMap.put(3, "q");
        inheritedMap.put(4, "w");
        inheritedMap.put(5, "e");
        System.out.println(inheritedMap);
        testMap.putAll(inheritedMap);
        System.out.println(testMap);
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "v");
        treeMap.put(6, "k");
        treeMap.put(777, "[");
        treeMap.put(-4, "[");
//        treeMap.put(null, "[");
        treeMap.put(-7, null);
        System.out.println(treeMap);
        Set<Map.Entry<Integer, String>> keySet = treeMap.entrySet();
        System.out.println(keySet);
    }
}


