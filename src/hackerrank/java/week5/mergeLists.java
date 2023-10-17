package hackerrank.java.week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class mergeLists {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();

        for (int i = 0; i < t; i++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            Map<Integer, Integer> treeMap = new HashMap<>();
            int first = r.nextInt();
            for (int n = 0; n < first; n++) {
                int hb = r.nextInt();
                treeMap.put(hb, treeMap.get(hb) != null ? treeMap.get(hb) + 1 : 1);
                treeSet.add(hb);
            }
            int second = r.nextInt();
            for (int n = 0; n < second; n++) {
                int hb = r.nextInt();
                treeSet.add(hb);
                treeMap.put(hb, treeMap.get(hb) != null ? treeMap.get(hb) + 1 : 1);
            }

            for (Integer element : treeSet) {
                for (int hp = 0; hp < treeMap.get(element); hp++) {
                    System.out.print(element + " ");
                }
            }
            System.out.println();
        }
    }

    // soltuion like the Hackerrank
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode mergedHead = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current = mergedHead;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return mergedHead.next;
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
}
