package hackerrank.java.week7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LilysHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Integer[] h = new Integer[n];
        Integer[] copyArray = new Integer[n];
        Integer[] copyArrayReverse = new Integer[n];

        Map<Integer, Integer> oneWay = new HashMap();
        Map<Integer, Integer> reverseWay = new HashMap();

        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
            copyArray[i] = h[i];
            copyArrayReverse[i] = h[i];
            oneWay.put(h[i], i);
            reverseWay.put(h[i], i);
        }

        Arrays.sort(h);
        int first = oneWayCalculation(h, copyArray, oneWay);

        Arrays.sort(h, Collections.reverseOrder());
        int second = oneWayCalculation(h, copyArrayReverse, reverseWay);
        System.out.println(first > second ? second : first);
    }

    // The basic implemenation showed for 3 4 2 5 1 in an ascending position
    public static int oneWayCalculation(Integer[] arr, Integer[] copyArray, Map<Integer, Integer> oneWay) {
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
        return total;
    }
}
