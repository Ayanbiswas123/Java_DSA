import java.util.Scanner;

public class A5_CircularLinkedList {

    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static class CircularLinkedList {
        Node head = null;
        Node tail = null;

        // Method to display the list forward
        public int checkListEmptyOrNot(){
            if(head == null){
                return 0;
            }
            return 1;
        }
        
        // Method to display the list forward
        public void displayForward() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

        // Method to display the list backward
        public void displayBackward() {
            if (tail == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = tail;
            do {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            } while (temp != tail);
            System.out.println();
        }

        // Method to add a node at the end of the list
        public void addEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
                head.prev = tail;
                tail.next = head;
            } else {
                newNode.prev = tail;
                newNode.next = head;
                tail.next = newNode;
                tail = newNode;
                head.prev = tail;
            }
        }

        // Method to add a node at the beginning of the list
        public void addFirst(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
                head.prev = tail;
                tail.next = head;
            } else {
                newNode.next = head;
                newNode.prev = tail;
                head.prev = newNode;
                head = newNode;
                tail.next = head;
            }
        }

        // Method to delete a node by value
        public void delete(int val) {
            if (head == null) {
                System.out.println("List is empty, nothing to delete");
                return;
            }
            if (head.data == val) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                }
                return;
            }
            Node temp = head;
            while (temp != null && temp.data != val) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Node with value " + val + " not found");
            } else {
                if (temp == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList dll = new CircularLinkedList();

        int choice = 0;
        while (choice != 5) {
            System.out.println("\nCircular Doubly Linked List Operations:");
            System.out.println("1. Add at beginning");
            System.out.println("2. Add at end");
            System.out.println("3. Delete node");
            System.out.println("4. Display list");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("--------------------------------------------------");

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at the beginning: ");
                    int valueToAddFirst = scanner.nextInt();
                    dll.addFirst(valueToAddFirst);
                    break;
                case 2:
                    System.out.print("Enter value to add at the end: ");
                    int valueToAddEnd = scanner.nextInt();
                    dll.addEnd(valueToAddEnd);
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int valueToDelete = scanner.nextInt();
                    dll.delete(valueToDelete);
                    break;
                case 4:
                    int check = dll.checkListEmptyOrNot();
                    if(check == 1){
                        System.out.println("Forward traversal:");
                        dll.displayForward();
                        System.out.println("Backward traversal:");
                        dll.displayBackward();
                    }else{
                        System.out.println("List is Empty");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
