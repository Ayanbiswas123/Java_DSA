public class A3_DoubleLinkedList {

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

    public static class DoubleLinkedList {
        Node head = null;
        Node tail = null;

        // Method to display the list forward
        public void displayForward() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Method to display the list backward
        public void displayBackward() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

        // Method to add a node at the end of the list
        public void addEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Method to add a node at the beginning of the list
        public void addFirst(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
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
                    head.prev = null;
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
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        // Adding nodes to the doubly linked list
        dll.addEnd(1);
        dll.addEnd(2);
        dll.addEnd(3);
        dll.addEnd(4);

        // Displaying the doubly linked list forward and backward
        System.out.println("Forward traversal:");
        dll.displayForward(); // Output: 1 2 3 4

        System.out.println("Backward traversal:");
        dll.displayBackward(); // Output: 4 3 2 1

        // Adding nodes at the beginning and displaying the list
        dll.addFirst(0);
        System.out.println("List after adding 0 at the beginning:");
        dll.displayForward(); // Output: 0 1 2 3 4

        // Deleting nodes and displaying the list
        dll.delete(2);
        System.out.println("List after deleting node with value 2:");
        dll.displayForward(); // Output: 0 1 3 4

        dll.delete(0);
        dll.delete(4);
        System.out.println("List after deleting nodes with values 0 and 4:");
        dll.displayForward(); // Output: 1 3
    }
}
