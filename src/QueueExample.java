import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void getQueueExample(){
        System.out.println("Queue");
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.offer("q");//adding elem to queue
        stringQueue.offer("a");
        stringQueue.offer("z");
        stringQueue.offer("w");
        System.out.println(stringQueue.peek()); //return head of queue. NO DELETE
        System.out.println(stringQueue.element()); //return head of queue. NO DELETE

        System.out.println(stringQueue);

        System.out.println(stringQueue.poll()); //return head of queue. DELETE
        System.out.println(stringQueue);

        for (String e:stringQueue) {
            System.out.print(" " + e);
        }
        System.out.println();
        System.out.println("End of Queue");
    }
}
