package hackerrank.java.month.week3;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseAndCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] p = new int[n];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int u = 0; u < n; u++) {
            p[u] = scanner.nextInt();
            priorityQueue.add(p[u]);
        }

        //System.out.println(priorityQueue);
        int total = 0;
        Boolean isNotPossible = Boolean.FALSE;

        for (; ; ) {
            if (priorityQueue.peek() >= k) {
                break;
            }

            try {
                int combinationData = priorityQueue.poll() * 1 + priorityQueue.poll() * 2;
                priorityQueue.add(combinationData);
                //System.out.println(priorityQueue);
                total++;
            } catch (Exception e) {
                isNotPossible = Boolean.TRUE;
                break;
            }
        }

        if (!isNotPossible) {
            System.out.println(total);
        } else {
            System.out.println("-1");
        }

    }
}
