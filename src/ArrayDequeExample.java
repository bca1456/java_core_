import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeExample {
    public static void getArrayDequeExample(){
        System.out.println("ArrayDeque");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("elem 1"); //add to tail
        arrayDeque.addFirst("elem 2"); //add to head
        arrayDeque.addLast("elem 3"); //add to tail
        arrayDeque.push("elem 4"); //add to head
        arrayDeque.offer("elem 5"); //add to tail
        arrayDeque.offerFirst("elem 6"); //head
        arrayDeque.offerLast("elem 7"); //tail
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek()); //HEAD. no delete
        System.out.println(arrayDeque.pop()); //HEAD. delete
        System.out.println(arrayDeque);
        System.out.println("End of ArrayDeque =)");
    }
}
