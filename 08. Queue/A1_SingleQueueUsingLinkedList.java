import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A1_SingleQueueUsingLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Peek element");
            System.out.println("4. Display all elements");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.nextLine();
                    queue.offer(elementToAdd);
                    System.out.println("Element added.");
                    break;
                case 2:
                    String removedElement = queue.poll();
                    if (removedElement != null) {
                        System.out.println("Removed element: " + removedElement);
                    } else {
                        System.out.println("Queue is empty. No element removed.");
                    }
                    break;
                case 3:
                    String peekedElement = queue.peek();
                    if (peekedElement != null) {
                        System.out.println("Peeked element: " + peekedElement);
                    } else {
                        System.out.println("Queue is empty. No element to peek.");
                    }
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue elements:");
                        for (String element : queue) {
                            System.out.println(element);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            System.out.println(); // Blank line for readability
        }
    }
}
