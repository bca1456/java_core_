import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void getPriorityQueueExample(){
        System.out.println("PriorityQueue");
        Queue<String> stringQueue = new PriorityQueue<>(new StringLengthComparator());
        stringQueue.offer("qwe");
        stringQueue.offer("qq");
        stringQueue.offer("qweeeeee");
        stringQueue.offer("e");
        stringQueue.offer("q");
        System.out.println(stringQueue);
        System.out.println("End of PriorityQueue");
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o2.length() < o1.length()){
            return -1;
        } else {
            return 1;
        }
    }
}
