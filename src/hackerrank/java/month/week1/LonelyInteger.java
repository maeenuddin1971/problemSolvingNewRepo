package hackerrank.java.month.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LonelyInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] p = new int[t];
        Map<Integer, Integer> km = new HashMap<>();

        for (int u = 0; u < t; u++) {
            int hb = scanner.nextInt();
            km.put(hb, km.containsKey(hb) ? km.get(hb) + 1 : 1);
        }

        for (Integer hn : km.keySet()) {
            if (km.get(hn) == 1) {
                System.out.println(hn);
                break;
            }
        }
    }
}
