package hackerrank.java.month.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // first part of the ticket
        int i = scanner.nextInt();
        String[] p = new String[i];
        scanner.nextLine();

        // Map to store the total number of the elemtns
        Map<String, Integer> firstStringNumber = new HashMap<>();

        for (int u = 0; u < i; u++) {
            p[u] = scanner.nextLine();
            countStringInMap(firstStringNumber, p[u]);
        }
        // second part of the ticket
        //scanner.nextLine();
        int k = scanner.nextInt();
        String[] km = new String[k];
        scanner.nextLine();

        for (int h = 0; h < k; h++) {
            km[h] = scanner.nextLine();
        }

        printString(firstStringNumber, km);
    }

    public static void printString(Map<String, Integer> km, String[] pk) {
        for (String hn : pk) {
            if (km.containsKey(hn)) {
                System.out.println(km.get(hn));
            } else {
                System.out.println("0");
            }
        }
    }

    public static void countStringInMap(Map<String, Integer> gh, String km) {
        if (!gh.containsKey(km)) {
            gh.put(km, 1);
        } else {
            gh.put(km, gh.get(km) + 1);
        }
    }
}
