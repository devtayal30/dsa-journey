import java.util.ArrayDeque;
import java.util.Deque;

public class InbuiltQueue {
    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(3);
        // queue.add(33);
        // queue.add(2);
        // queue.add(34);
        // queue.add(11);
        // queue.add(56);

        // System.out.println(queue.peek());
        // System.out.println(queue.remove());

        
        // Insert and delete from both direction
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(78);
        deque.addLast(45);
    }
}
