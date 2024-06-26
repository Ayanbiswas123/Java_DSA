public class A1_singleLinkedList {

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
        public void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Add a value at the end position
        public Node addEndIndex(Node head, int val) {
            Node newNode = new Node(val);
            if (head == null) {
                return newNode;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return head;
        }

        // Add a value at the first position
        public Node addFirstIndex(Node head, int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        // Delete a node by value
        public Node deleteNode(Node head, int val) {
            if (head == null) {
                return null;
            }
            if (head.data == val) {
                // If the head node is to be deleted, return the next node as the new head
                return head.next;
            }
            Node temp = head;
            while (temp.next != null && temp.next.data != val) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
            return head;
        }

        // Add a value at a particular position
        public Node addAtPosition(Node head, int val, int position) {
            Node newNode = new Node(val);
            if (position == 0) {
                newNode.next = head;
                return newNode;
            }
            Node temp = head;
            for (int i = 0; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                // Position is greater than the length of the list, add at end
                return addEndIndex(head, val);
            }
            return head;
        }
    }

    public static void main(String[] args) {
        // Initialize nodes
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        // Link nodes to form the initial list
        a.next = b;
        b.next = c;
        c.next = d;

        // Create LinkedList object
        LinkedList list = new LinkedList();

        System.out.println("Original List:");
        list.display(a);

        System.out.println("Adding 0 at the first position:");
        Node newNode = list.addFirstIndex(a, 0);
        list.display(newNode);

        System.out.println("Adding 121 at the end position:");
        newNode = list.addEndIndex(newNode, 121);
        list.display(newNode);

        System.out.println("Adding 122 at the end position:");
        newNode = list.addEndIndex(newNode, 122);
        list.display(newNode);

        System.out.println("Deleting node with value 2:");
        newNode = list.deleteNode(newNode, 2);
        list.display(newNode);

        System.out.println("Adding 99 at position 2:");
        newNode = list.addAtPosition(newNode, 99, 2);
        list.display(newNode);

        System.out.println("Adding 100 at position 0:");
        newNode = list.addAtPosition(newNode, 100, 0);
        list.display(newNode);

        System.out.println("Adding 200 at position 10 (greater than list length):");
        newNode = list.addAtPosition(newNode, 200, 10);
        list.display(newNode);
    }
}
