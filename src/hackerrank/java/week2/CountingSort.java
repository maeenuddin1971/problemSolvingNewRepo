package hackerrank.java.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();

        int[] p = new int[n];
        Map<Integer, Integer> total = new HashMap<>();

        for (int i = 0; i < p.length; i++) {
            p[i] = r.nextInt();
            if (total.containsKey(p[i])) {
                total.put(p[i], total.get(p[i]) + 1);
            } else {
                total.put(p[i], 1);
            }
        }

        for (int i = 0; i < 100; i++) {
            if (total.containsKey(i)) {
                System.out.print(total.get(i)+" ");
            } else {
                System.out.print(0+" ");
            }
        }

    }
}
