package bootcoding.basicmatths.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
    }
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public static void printLinkedList(Node head){
           Node temp = head;
           while (temp != null){
               System.out.println(temp.data);
               temp = temp.next;
           }
        }
        private static Node createLinkedList(){
            Node firstNode = new Node(10);
            Node secondNode = new Node(20);
            Node thirdNode = new Node(30);
            Node forthNode = new Node(40);

            Node head = firstNode;
            head.next = secondNode;
            secondNode.next = thirdNode;
            thirdNode.next = forthNode;
            forthNode.next = null;
            return head;
        }



}
