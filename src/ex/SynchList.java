package ex;

import helpers.ThreadHelper;

import java.util.*;

public class SynchList {
    public static void getExample(){
        List<String> syncCollection = Collections.synchronizedList(Arrays.asList("1", "s", "123a"));
        List<String> upperCaseList = new ArrayList<>();

        Runnable listOperations = () -> {
            synchronized (syncCollection){
                syncCollection.forEach((elem) -> {
                    upperCaseList.add(elem.toUpperCase());
                });
            }
        };
        ThreadHelper.getListOfThreads(listOperations, 5);
        System.out.println(upperCaseList);
    }
}
