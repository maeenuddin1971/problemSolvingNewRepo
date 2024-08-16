package hackerrank.java.month.week1;

import java.util.Scanner;

public class SubarrayDivision1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] s2 = new int[s];

        for (int y = 0; y < s; y++) {
            s2[y] = scanner.nextInt();
        }

        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int totalResult = 0;

        for (int y = 0; y < s; ) {
            int sum = 0;
            Boolean isAns = Boolean.TRUE;
            int h = 0;

            for (int g = y; g < m; g++) {
                sum = sum + s2[g];
                if (sum > d) {
                    isAns = Boolean.FALSE;
                    break;
                }
                h++;
            }

            if (isAns && sum == d) {
                totalResult++;
                y = y + h;
            } else {
                y++;
            }
        }

        System.out.println(totalResult);
    }
}
