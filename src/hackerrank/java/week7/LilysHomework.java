package hackerrank.java.week7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LilysHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] h = new int[n];
        int[] copyArray = new int[n];

        Map<Integer, Integer> oneWay = new HashMap();

        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
            copyArray[i] = h[i];
            oneWay.put(h[i], i);
        }

        Arrays.sort(h);

        oneWayCalculation(h, copyArray, oneWay);
    }

    // The basic implemenation showed for 3 4 2 5 1 in an ascending position
    public static void oneWayCalculation(int[] arr, int[] copyArray, Map<Integer, Integer> oneWay) {
        int total = 0;
        for (int u = 0; u < arr.length; u++) {
            if (oneWay.get(arr[u]) != u) {
                // Here let's say position of 1 in the map which is 4
                int oldPositionOfSortedArray = oneWay.get(arr[u]);
                // Here let's say in the unsroted array who is in 0 th psotion which is 3
                int whoInU = copyArray[u];
                // Now put arr[u] which is 1 , it's new position 0 which is u
                oneWay.put(arr[u], u);
                // Now whoinU which is 3 keep it in the old position of 1 which is 4 in the map
                oneWay.put(whoInU, oldPositionOfSortedArray);
                // in the copyarray also change the position of both 1 and 3

                // here in u means at 0 will be arr[u] which is 1
                copyArray[u] = arr[u];

                // now in the copy array position 4 which was 1 before it will be 3 and this is whoInU
                copyArray[oldPositionOfSortedArray] = whoInU;
                // contine the array
                total++;
            }
        }

        System.out.println(total);
    }
}
