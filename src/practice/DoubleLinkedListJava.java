package practice;

public class DoubleLinkedListJava {

    Node head = null;
    Node trail = null;

    public void insertAtLastList(int data) {

        Node newNode = new Node(data);

        if (trail == null) {
            head = trail = newNode;
        } else {
            newNode.prev = trail;
            trail.next = newNode;
            trail = newNode;
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = trail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void reverseList() {
        Node temp = null;
        Node currentHead = head;

        while(currentHead != null) {
            temp = currentHead.prev;
            currentHead.prev = currentHead.next;
            currentHead.next = temp;

            currentHead = currentHead.prev;
        }

        if(temp != null) {
            temp = head;
            head = trail;
            trail = temp;
        }
    }

    public void printAllElementsFromHead() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
