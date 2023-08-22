package hackerrank.java.week4;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        BigInteger x = r.nextBigInteger();
        BigInteger k = r.nextBigInteger();

        BigInteger finalNumber = x.multiply(k);

        BigInteger result = sumOfTheDigits(finalNumber);

        for (; ; ) {
            if (result.toString().length() == 1) {
                System.out.println(result);
                break;
            } else {
                result = sumOfTheDigits(result);
            }
        }
    }

    public static BigInteger sumOfTheDigits(BigInteger x) {
        String bigX = x.toString();
        BigInteger sum = BigInteger.valueOf(0);

        for (int h = 0; h < bigX.length(); h++) {
            sum = sum.add(new BigInteger(String.valueOf(bigX.charAt(h))));
        }

        return sum;
    }
}
