package hackerrank.java.week4;

import java.util.Scanner;

public class NewYearChaos {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        for (int i = 0; i < t; i++) {
            int n = r.nextInt();
            int[] p = new int[n];
            Boolean isChaotic = Boolean.FALSE;
            int sum = 0;

            for(int m = 0; m < n ; m++) {
                p[m] = r.nextInt();
            }

            for (int m = 0; m < n; m++) {
                int position = 0;
                if (p[m] > m + 1) {
                    position = Math.abs((m + 1) - p[m]);
                    sum = sum + position;
                }
                if (position > 2) {
                    isChaotic = Boolean.TRUE;
                    break;
                }
            }

            if (isChaotic == Boolean.TRUE) {
                System.out.println("Too chaotic");
            }
            else {
                System.out.println(sum);
            }
        }
    }
}
