package hackerrank.java.week1;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Long[] p = new Long[5];

        for (int i = 0; i < 5; i++) {
            p[i] = r.nextLong();
        }

        Arrays.sort(p);


        Long minSum = Long.valueOf(0);
        Long  maxSum = Long.valueOf(0);

        for (int i = 0; i < 5; i++) {
            if (i != 4) {
                minSum = minSum + p[i];
            }

            if (i != 0) {
                maxSum = maxSum + p[i];
            }
        }

        System.out.println(minSum + " " + maxSum);

    }

}
