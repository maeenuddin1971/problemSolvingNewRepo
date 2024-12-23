package practice;

import java.util.Scanner;

public class SingleLinkedListJavaMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingleLinkedListJava singleLinkedListJava = new SingleLinkedListJava();
        int f = scanner.nextInt();

        for (int i = 0; i < f; i++) {
            int h = scanner.nextInt();
            singleLinkedListJava.insertAtLast(h);
        }

        //singleLinkedListJava.printDataInTheList();

        int data = scanner.nextInt();
        int position = scanner.nextInt();

        singleLinkedListJava.insertAtAPosition(data, position);
        //System.out.println();
        singleLinkedListJava.printDataInTheList();
    }

}
