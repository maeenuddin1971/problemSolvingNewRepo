package hackerrank.java.month.week2;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger();
        BigInteger k = scanner.nextBigInteger();
        BigInteger summation = n.multiply(k);

        String initialString = String.valueOf(summation);
        int sum;

        for (; ; ) {
            sum = 0;

            for (int kp = 0; kp < initialString.length(); kp++) {
                sum = sum + Character.getNumericValue(initialString.charAt(kp));
            }

            String stringOfSum = String.valueOf(sum);

            if (stringOfSum.length() == 1) {
                break;
            }

            initialString = stringOfSum;
        }

        System.out.println(sum);
    }
}
