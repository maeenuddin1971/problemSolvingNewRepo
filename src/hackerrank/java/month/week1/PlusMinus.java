package hackerrank.java.month.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        Map<String, Integer> postivieNegative = new HashMap<>();

        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
            if (p[i] > 0) {
                if (!postivieNegative.containsKey("POSITIVE")) {
                    postivieNegative.put("POSITIVE", 1);
                } else {
                    postivieNegative.put("POSITIVE", postivieNegative.get("POSITIVE") + 1);
                }
            } else if (p[i] < 0) {
                if (!postivieNegative.containsKey("NEGATIVE")) {
                    postivieNegative.put("NEGATIVE", 1);
                } else {
                    postivieNegative.put("NEGATIVE", postivieNegative.get("NEGATIVE") + 1);
                }
            } else {
                if (!postivieNegative.containsKey("NEUTRAL")) {
                    postivieNegative.put("NEUTRAL", 1);
                } else {
                    postivieNegative.put("NEUTRAL", postivieNegative.get("NEUTRAL") + 1);
                }
            }
        }

        printRatiosValue(postivieNegative, n);
    }

    public static void printRatiosValue(Map<String, Integer> postivieNegative, int n) {
        if (postivieNegative.containsKey("POSITIVE")) {
            Double value = (double) postivieNegative.get("POSITIVE") / n;
            System.out.printf("%.6f", value);
            System.out.println();
        } else {
            System.out.println("0.000000");
        }
        if (postivieNegative.containsKey("NEGATIVE")) {
            Double value = (double) postivieNegative.get("NEGATIVE") / n;
            System.out.printf("%.6f", value);
            System.out.println();
        } else {
            System.out.println("0.000000");
        }
        if (postivieNegative.containsKey("NEUTRAL")) {
            Double value = (double) postivieNegative.get("NEUTRAL") / n;
            System.out.printf("%.6f", value);
            System.out.println();
        } else {
            System.out.println("0.000000");
        }
    }
}
