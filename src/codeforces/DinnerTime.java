package codeforces;

import java.util.Scanner;

public class DinnerTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        for (int u = 0; u < i; u++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (n % p == 0 || p == 1) {
                int divideResult = n / p;
                //System.out.println(divideResult);
                int totalMult = divideResult * q;
                //System.out.println(totalMult);
                //System.out.println(m);
                if (totalMult > m || totalMult < m) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            } else {
                System.out.println("Yes");
            }
        }


    }
}
