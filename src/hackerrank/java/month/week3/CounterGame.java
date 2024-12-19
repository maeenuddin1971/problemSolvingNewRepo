package hackerrank.java.month.week3;

import java.util.Scanner;

public class CounterGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumber = scanner.nextInt();

        for (int i = 0; i < totalNumber; i++) {
            Long bigInteger = scanner.nextLong();
            int step = 0;

            //System.out.println(step);
            System.out.println(counterGame(bigInteger));
        }
    }

    public static String counterGame(long n)
    {
        int count = 0;
        long a;
        while (n > 1) {
            a = (long)Math.pow(2, Long.toBinaryString(n).length() - 1);
            n = n == a ? n - a : n / 2;
            count++;
        }

        return count % 2 == 0 ? "Richard" : "Louise";
    }


}
