package hackerrank.java.month.week1;

import java.util.Arrays;
import java.util.Scanner;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int p = scanner.nextInt();
            int h = scanner.nextInt();
            int[] km = new int[p];
            int[] hf = new int[p];

            for (int km1 = 0; km1 < p; km1++) {
                km[km1] = scanner.nextInt();
            }

            for (int fr = 0; fr < p; fr++) {
                hf[fr] = scanner.nextInt();
            }

            Arrays.sort(km);
            Arrays.sort(hf);

            Boolean isPer = Boolean.TRUE;
            for (int e = 0, m = hf.length - 1; e < km.length; e++, m--) {
                if (km[e] + hf[m] < h) {
                    isPer = Boolean.FALSE;
                    break;
                }
            }

            if (isPer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
