package hackerrank.java.week4;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        for (int u = 0; u < t; u++) {
            int k = r.nextInt();
            String[] p = new String[k];

            r.nextLine();
            for (int m = 0; m < k; m++) {
                p[m] = r.nextLine();
                char[] charArray = p[m].toCharArray();
                Arrays.sort(charArray);
                p[m] = String.valueOf(charArray);
            }

            Boolean isAscen = isAscen(p, p[0].length());

            if (Boolean.FALSE == isAscen) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    public static Boolean isAscen(String[] p, int k) {
        Boolean isAscen = Boolean.TRUE;

        for (int m = 0; m < k; m++) {
            for (int b = 0; b < k - 1; b++) {
                if (p[b].charAt(m) > p[b + 1].charAt(m)) {
                    isAscen = Boolean.FALSE;
                    return isAscen;
                }
            }
        }
        return isAscen;
    }
}
