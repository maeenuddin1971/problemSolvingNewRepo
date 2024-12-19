package hackerrank.java.month.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] p = new int[n];

        Map<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        int k = 1;
        for (int t = 0; t < n; t++) {
            p[t] = scanner.nextInt();
            treeSet.add(p[t]);
            if (map.containsKey(p[t])) {
                continue;
            }
            map.put(p[t], k);
            k++;
        }

        int h = scanner.nextInt();
        int[] m = new int[h];

        List<Integer> list = new ArrayList<>();
        for (int u = 0; u < h; u++) {
            m[u] = scanner.nextInt();

            Integer score = treeSet.ceiling(m[u]);
            if (score == null) {
                System.out.println(map.get(p[n - 1]) + 1);
            } else if (map.containsKey(m[u])) {
                System.out.println(map.get(m[u]));
            } else {
                System.out.println(map.get(score));
            }
        }
    }
}
