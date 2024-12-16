package hackerrank.java.month.week2;

import java.math.BigInteger;
import java.util.Scanner;

public class SumVsXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long gh = scanner.nextLong();

        long result = 0;

        if(gh != 0) {
            String binaryRepresentation = Long.toBinaryString(gh);
            int bitNumber = 0;

            for (Character c : binaryRepresentation.toCharArray()) {
                if (c.equals('0')) {
                    bitNumber++;
                }
            }
            System.out.println(BigInteger.valueOf(2).pow(bitNumber));
        } else {
            System.out.println(1);
        }
    }
}
