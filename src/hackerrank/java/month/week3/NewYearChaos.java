package hackerrank.java.month.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewYearChaos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ph = scanner.nextInt();

        for (int ip = 0; ip < ph; ip++) {

            int n = scanner.nextInt();

            int[] p = new int[n];
            Map<Integer, Integer> dataMap = new HashMap<>();
            Map<Integer, Integer> dataPosition = new HashMap<>();

            for (int i = 0; i < n; i++) {
                p[i] = scanner.nextInt();
                dataMap.put(p[i], i + 1);
                dataPosition.put(i + 1, p[i]);
            }


            Boolean isChaotic = Boolean.FALSE;
            int sum = 0;
            for (int u = n; u >= 1; u--) {
                int position = u - dataMap.get(u);

                if (position == 0) {
                    continue;
                }

                if (position > 2) {
                    isChaotic = Boolean.TRUE;
                    break;
                } else {
                    if (position == 1) {
                        dataMap.put(dataPosition.get(u), u - 1);
                        dataPosition.put(u - 1, dataPosition.get(u));
                    } else if (position == 2) {
                        int secondData = dataPosition.get(u - 1);
                        dataMap.put(dataPosition.get(u), u - 1);
                        dataPosition.put(u - 1, dataPosition.get(u));
                        dataMap.put(secondData, u - 2);
                        dataPosition.put(u - 2, secondData);
                    }
                    sum = sum + position;
                    dataMap.put(u, u);
                    dataPosition.put(u, u);
                }
            }

            if (isChaotic) {
                System.out.println("Too chaotic");
            } else {
                System.out.println(sum);
            }
        }
    }
}
