package hackerrank.java.month.week1;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long[] t = new Long[5];
        Long sum = 0L;

        for (int i = 0; i < 5; i++) {
            t[i] = scanner.nextLong();
            sum = sum+t[i];
        }

        Arrays.sort(t);
        System.out.print(sum-t[t.length-1] + " ");
        System.out.println(sum-t[0]);
    }
}
