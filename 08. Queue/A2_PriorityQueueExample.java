import java.util.PriorityQueue;
import java.util.Queue;

public class A2_PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding elements to the priority queue
        queue.offer(3);
        queue.offer(1);
        queue.offer(2);

        // Removing and printing elements from the priority queue
        System.out.println(queue.poll()); // Output: 1
        System.out.println(queue.peek()); // Output: 2
        System.out.println(queue.poll()); // Output: 2
    }
}
