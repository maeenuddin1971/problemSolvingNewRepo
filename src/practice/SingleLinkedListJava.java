package practice;

public class SingleLinkedListJava {

    Node head = null;
    Node tail = null;

    public void insertAtLast(int data) {
        if (head == null) {
            Node node = new Node(data);
            head = node;
            tail = head;
            head.next = tail;
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
        }
    }

    public void printDataInTheList() {
        Node current = head;
        while (current != null) {
            System.out.printf(current.data + " ");
            current = current.next;
        }
    }

    public void insertAtAPosition(int data, int position) {
        if (position == 0) {
            Node node = new Node(data);
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int h = 0; h < position - 1; h++) {
                current = current.next;
            }

            Node newPosition = new Node(data);
            if(current.next == null) {
                current.next = newPosition;
            } else {
                Node oldData = current.next;
                current.next = newPosition;
                newPosition.next = oldData;
            }
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
