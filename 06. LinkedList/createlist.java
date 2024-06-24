public class createlist {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        //Add a value in the node
        public Node Add(Node head, int val) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            temp.next = newNode;
            return newNode;
        }
        //Add a value a perticular position 
        public Node addFirstIndex(Node head, int val){
            if(head != null){
                Node newNode = new Node(val);
                newNode.next = head;
                return newNode;
            }else{
                head = Add(head, val); // Corrected method call
                return head;
            }
        }
        //insert at end
        public Node addEndIndex(Node head, int val){
            if(head != null){
                Node temp = head;
                 while(temp.next != null){
                    temp = temp.next;
                 }
                 Node newNode = new Node(val);
                 temp.next = newNode;
                 return head;
            }else{
                head = Add(head, val);
                 return head;
            }
        } 
        
        // Delete a value from a node if value is exist
        
    
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        linkedList li = new linkedList();
        Node newNode = li.addFirstIndex(a,100);
        li.display(newNode);
        li.addEndIndex(a, 121);
        li.display(a);
        li.addEndIndex(a, 122);
        li.display(a);

    }
}