package hackerrank.java.week6;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class JesseAndCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[t];
        Queue<Integer> sortedQueue = new PriorityQueue<>();


        for (int y = 0; y < t; y++) {
            p[y] = sc.nextInt();
            sortedQueue.add(p[y]);
        }

        int result = 0;
        Boolean isPossible = Boolean.FALSE;
        while (!sortedQueue.isEmpty()) {
            int pm = sortedQueue.peek();

            if (pm >= k) {
                isPossible = Boolean.TRUE;
                break;
            }

            if (sortedQueue.size() >= 2) {
                int first = sortedQueue.poll();
                int second = sortedQueue.poll();
                int summation = first + 2 * second;
                sortedQueue.add(summation);
            } else {
                break;
            }
            result++;
        }
        if (isPossible) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
    }
}
