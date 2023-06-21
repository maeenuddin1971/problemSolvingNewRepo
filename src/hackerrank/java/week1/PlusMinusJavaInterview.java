package hackerrank.java.week1;

import java.util.Scanner;

public class PlusMinusJavaInterview {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        // This are the flag of positive, negative and zero
        Double positive = 0.00, negative = 0.00, zeros = 0.00;

        int n = r.nextInt();

        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = r.nextInt();

            if (p[i] > 0) {
                positive++;
            } else if (p[i] < 0) {
                negative++;
            } else {
                zeros++;
            }

        }

        Double positveResult = Double.valueOf(positive / n);
        Double negativeResult = Double.valueOf(negative / n);
        Double zerosResult = Double.valueOf(zeros / n);

        System.out.format("%.6f\n", positveResult);
        System.out.format("%.6f\n", negativeResult);
        System.out.format("%.6f\n", zerosResult);

    }
}
