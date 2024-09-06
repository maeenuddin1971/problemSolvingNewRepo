package hackerrank.java.month.week2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesbyMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] p = new int[n];
        Map<Integer, Integer> pk = new HashMap<>();

        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
            pk.put(p[i], pk.getOrDefault(p[i], 0) + 1);
        }

        int sum = 0;
        for (Integer hb : pk.keySet()) {
            sum = sum + pk.get(hb) / 2;
        }

        // alternative lambda
        int sum2 = pk.values().stream().mapToInt(value -> value /2).sum();

        System.out.println(sum2);
    }
}
