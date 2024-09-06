package hackerrank.java.month.week1.test;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g = scanner.nextInt();
        int[] p = new int[g];

        for (int i = 0; i < g; i++) {
            p[i] = scanner.nextInt();
        }

        Arrays.sort(p);

        System.out.println(p[g/2]);
    }
}
