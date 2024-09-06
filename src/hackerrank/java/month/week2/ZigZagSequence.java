package hackerrank.java.month.week2;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int[] p = new int[h];

        for (int m = 0; m < h; m++) {
            p[m] = scanner.nextInt();
        }

        findZigZagSequence(p, h);
    }

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = n/2;

        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
