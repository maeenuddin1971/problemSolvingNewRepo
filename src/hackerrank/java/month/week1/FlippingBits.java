package hackerrank.java.month.week1;

import java.math.BigInteger;
import java.util.Scanner;

public class FlippingBits {

    public static String thirtyTwoBitString = "0".repeat(32);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumberOfLoop = scanner.nextInt();

        for (int hn = 0; hn < totalNumberOfLoop; hn++) {
            BigInteger intNumber = scanner.nextBigInteger();
            String binaryString = intNumber.toString(2);
            String thirtyTwoBitWithBinary = thirtyTwoBitString.substring(0, 32 - binaryString.length()) + binaryString;
            String flipped32BitString = flippedBinaryString(thirtyTwoBitWithBinary);
            BigInteger bigInteger = new BigInteger(flipped32BitString, 2);
            System.out.println(bigInteger);
        }
    }

    public static String flippedBinaryString(String km) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : km.toCharArray()) {
            if (ch == '0') {
                stringBuilder.append('1');
            } else if (ch == '1') {
                stringBuilder.append('0');
            }
        }
        return stringBuilder.toString();
    }
}
