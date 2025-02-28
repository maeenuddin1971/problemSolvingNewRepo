package codeforces;

import java.util.Scanner;

public class FizzBuzzRemixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] p = new int[n];

        for (int u = 0; u < n; u++) {
            p[u] = scanner.nextInt();

            int devideWithZero = p[u] % 15;
            int actualDevide = p[u] / 15;

            if (devideWithZero > 2) {
                devideWithZero = 3;
            } else {
                devideWithZero = devideWithZero + 1;
            }

            int result = actualDevide * 3 + devideWithZero;

            System.out.println(result);
        }


    }
}
