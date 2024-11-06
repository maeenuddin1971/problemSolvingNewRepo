package hackerrank.java.month.week2;

import java.math.BigInteger;
import java.util.Scanner;

public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int u = 0; u < t; u++) {
            int n = scanner.nextInt();
            int[] p = new int[n];

            BigInteger totalSum = BigInteger.ZERO;

            for (int h = 0; h < n; h++) {
                p[h] = scanner.nextInt();
                totalSum = totalSum.add(BigInteger.valueOf(p[h]));
            }

            System.out.println(determineLogic(p, totalSum));
        }
    }

    public static String determineLogic(int[] numbers, BigInteger totalSum) {
        BigInteger leftSummation = BigInteger.ZERO;

        for (int h = 0; h < numbers.length; h++) {
            BigInteger rigtSum = totalSum.subtract(BigInteger.valueOf(numbers[h])).subtract(leftSummation);
            if (rigtSum.equals(leftSummation)) {
                return "YES";
            }
            leftSummation = leftSummation.add(BigInteger.valueOf(numbers[h]));
        }

        return "NO";
    }
}
