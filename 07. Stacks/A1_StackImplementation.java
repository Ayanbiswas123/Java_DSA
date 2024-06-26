import java.util.Stack;
import java.util.Scanner;

public class A1_StackImplementation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int choice = 0;
        while (choice != 6) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Search for an element");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("--------------------------------------------------");

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int valueToPush = scanner.nextInt();
                    stack.push(valueToPush);
                    System.out.println(valueToPush + " pushed to stack.");
                    break;
                case 2:
                    try {
                        int poppedValue = stack.pop();
                        System.out.println("Popped element: " + poppedValue);
                    } catch (Exception e) {
                        System.out.println("Error: Stack is empty, cannot pop.");
                    }
                    break;
                case 3:
                    try {
                        int peekedValue = stack.peek();
                        System.out.println("Top element (peek): " + peekedValue);
                    } catch (Exception e) {
                        System.out.println("Error: Stack is empty, cannot peek.");
                    }
                    break;
                case 4:
                    boolean isEmpty = stack.isEmpty();
                    System.out.println("Is stack empty? " + isEmpty);
                    break;
                case 5:
                    System.out.print("Enter element to search: ");
                    int elementToSearch = scanner.nextInt();
                    int position = stack.search(elementToSearch);
                    if (position == -1) {
                        System.out.println("Element " + elementToSearch + " not found in stack.");
                    } else {
                        System.out.println("Position of element " + elementToSearch + ": " + position);
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }

        scanner.close();
    }
}

