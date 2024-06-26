import java.util.Scanner;

public class A2_SingleLinkedListUserInput {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;

        // Method to display the list
        public void display() {
            if(head == null){
                System.out.println("List is Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Add a value at the end position
        public void addEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Add a value at the first position
        public void addFirst(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }

        // Delete a node by value
        public void deleteNode(int val) {
            if (head == null) {
                System.out.println("List is empty, nothing to delete");
                return;
            }
            if (head.data == val) {
                head = head.next;
                return;
            }
            Node temp = head;
            while (temp.next != null && temp.next.data != val) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            } else {
                System.out.println("Node with value " + val + " not found");
            }
        }

        // Add a value at a particular position
        public void addAtPosition(int val, int position) {
            Node newNode = new Node(val);
            if (position == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                // Position is greater than the length of the list, add at end
                addEnd(val);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice = 0;
        while (choice != 6) {
            System.out.println("\nLinked List Operations:");
            System.out.println("1. Display list");
            System.out.println("2. Add at beginning");
            System.out.println("3. Add at end");
            System.out.println("4. Delete node by value");
            System.out.println("5. Add at specific position");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            System.out.println("----------------------------------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("Displaying list:");
                    list.display();
                    break;
                case 2:
                    System.out.print("Enter value to add at the beginning: ");
                    int valueToAddFirst = scanner.nextInt();
                    list.addFirst(valueToAddFirst);
                    break;
                case 3:
                    System.out.print("Enter value to add at the end: ");
                    int valueToAddEnd = scanner.nextInt();
                    list.addEnd(valueToAddEnd);
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    int valueToDelete = scanner.nextInt();
                    list.deleteNode(valueToDelete);
                    break;
                case 5:
                    System.out.print("Enter value to add: ");
                    int valueToAdd = scanner.nextInt();
                    System.out.print("Enter position to add at: ");
                    int position = scanner.nextInt();
                    list.addAtPosition(valueToAdd, position);
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

