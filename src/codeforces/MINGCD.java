package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MINGCD {
    private static final Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
        }

        System.out.println(a[0]);
        Arrays.sort(a, 1, n + 1);

        System.out.println(a[1]);
        long x = 0;
        for(int i=2; i<=n; i++) {
            if(a[i] % a[1] == 0) {
                x = gcd(x, a[i]);

                System.out.println("Here gcd is "+x);
            }
        }
        if(x == a[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }

    }
}
