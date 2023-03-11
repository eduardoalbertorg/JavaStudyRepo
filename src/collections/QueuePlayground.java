package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePlayground {
    public static void main(String[] args) {
        Queue<String> fruitsQueue = new LinkedList<>();
        fruitsQueue.add("apple");
        fruitsQueue.add("peach");
        fruitsQueue.add("banana");
        fruitsQueue.add("orange");
        fruitsQueue.add("peach");

        System.out.println("Displaying queue content: " + fruitsQueue);
        System.out.println("Displaying head of queue or first element: " + fruitsQueue.peek());

    }
}
