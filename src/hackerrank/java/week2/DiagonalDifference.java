package hackerrank.java.week2;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int[][] m = new int[n][n];
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                m[i][t] = r.nextInt();
            }
        }

        for (int i = 0, p = n - 1; i < n; i++, p--) {
            sum1 = sum1 + m[i][i];
            sum2 = sum2 + m[i][p];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}
