package hackerrank.java.week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Week4MockTest {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int t = r.nextInt();
        double checkResult = 0.0;
        Map<Double, Integer> hn = new HashMap<>();

        for (int u = 0; u < t; u++) {
            int g = r.nextInt();
            int h = r.nextInt();

            //System.out.println(g+" "+h);

            double mb = (double) g / h;

            if (checkResult < mb) {
                checkResult = mb;
            }

            hn.put(mb, u);
        }

        System.out.println(hn.get(checkResult));
    }
}
