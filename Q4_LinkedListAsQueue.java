
import java.util.LinkedList;

public class Q4_LinkedListAsQueue {
    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue after enqueue: " + queue);

        queue.removeFirst();

        System.out.println("After dequeue: " + queue);
    }
}
