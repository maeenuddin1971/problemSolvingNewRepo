package codeforces;

import java.util.Scanner;

public class MaxAndMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();


        for (int u = 0; u < t; u++) {
            int gh = scanner.nextInt();

            if (gh % 2 == 0) {
                System.out.println("-1");
            } else {
                System.out.printf(gh+" ");
                for (int hb = 1; hb < gh; hb++) {
                    System.out.printf(hb+" ");
                }
                System.out.println();
            }
        }

    }
}
