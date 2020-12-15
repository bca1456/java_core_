import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void getDequeExample(){
        System.out.println("Deque");
        Deque<String> deque = new LinkedList<>();
        deque.add("elem 1"); //add to tail
        deque.addFirst("elem 2"); //add to head
        deque.addLast("elem 3"); //add to tail
        deque.push("elem 4"); //add to head
        deque.offer("elem 5"); //add to tail
        deque.offerFirst("elem 6"); //head
        deque.offerLast("elem 7"); //tail
        System.out.println(deque);

        System.out.println(deque.peek()); //HEAD. no delete
        System.out.println(deque.pop()); //HEAD. delete
        System.out.println(deque);
        System.out.println("End of Deque");
    }
}
