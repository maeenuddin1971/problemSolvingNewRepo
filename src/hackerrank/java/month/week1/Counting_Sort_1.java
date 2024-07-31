package hackerrank.java.month.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Counting_Sort_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] k = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            k[i] = scanner.nextInt();
            map.put(k[i], map.getOrDefault(k[i], 0) + 1);
        }

        // Iterate from 0 to 99
        IntStream.rangeClosed(0, 99).forEach(i -> System.out.print(map.getOrDefault(i, 0)+ " "));
    }
}
