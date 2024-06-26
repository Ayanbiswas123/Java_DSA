import java.util.ArrayDeque;
import java.util.Queue;

public class A3_ArrayDequeExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        // Adding elements to the deque
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        // Removing and printing elements from the deque
        System.out.println(queue.poll()); // Output: Element 1
        System.out.println(queue.peek()); // Output: Element 2
        System.out.println(queue.poll()); // Output: Element 2
    }
}

