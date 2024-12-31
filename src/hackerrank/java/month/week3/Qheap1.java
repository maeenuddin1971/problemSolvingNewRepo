package hackerrank.java.month.week3;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Qheap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int u = 0; u < n; u++) {
            int b = scanner.nextInt();

            if (b == 1) {
                int hf = scanner.nextInt();
                priorityQueue.add(hf);
            }

            if (b == 3) {
                System.out.println(priorityQueue.peek());
            }

            if (b == 2) {
                int hc = scanner.nextInt();
                priorityQueue.remove(hc);
            }
        }

    }
}
