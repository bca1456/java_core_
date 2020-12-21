package ex;

import helpers.ThreadHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynchCollections {
    public static void getExample(){
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Runnable listOperations = () -> {
            syncCollection.add(1);
            syncCollection.add(2);
            syncCollection.add(3);
            syncCollection.add(4);
        };

        ThreadHelper.getListOfThreads(listOperations, 5);

        System.out.println(syncCollection);
    }
}
