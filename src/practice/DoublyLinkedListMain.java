package practice;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedListJava doubleLinkedListJava = new DoubleLinkedListJava();
        doubleLinkedListJava.insertAtFirst(23);
        doubleLinkedListJava.insertAtLastList(34);
        doubleLinkedListJava.insertAtLastList(340);
        doubleLinkedListJava.insertAtFirst(5);

        doubleLinkedListJava.printAllElementsFromHead();

        System.out.println();

        doubleLinkedListJava.reverseList();

        doubleLinkedListJava.printAllElementsFromHead();
    }
}
