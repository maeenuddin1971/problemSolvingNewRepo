package hackerrank.java.month.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheMaximumSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hd = scanner.nextInt();

        for (int iu = 0; iu < hd; iu++) {

            int n = scanner.nextInt();

            int[] y = new int[n];

            Map<Integer, Integer> valueMapPositiveAndNegative = new HashMap<>();
            int sumPN = 0, sumP = 0;
            int highestValuePostiveAndNegative = 0;
            int highestOfAllValues = Integer.MIN_VALUE;


            for (int i = 0; i < n; i++) {
                y[i] = scanner.nextInt();
                sumPN = sumPN + y[i];

                if (y[i] > 0) {
                    sumP = sumP + y[i];
                }

                // calculating vale for 2 -1 2 3 4 -5 Here
                if (sumPN <= 0) {
                    valueMapPositiveAndNegative.put(i, 0);
                    sumPN = 0;
                } else {
                    valueMapPositiveAndNegative.put(i, sumPN);

                    // here for all the summation with the negative this will determine the highest of those values
                    if (highestValuePostiveAndNegative < sumPN) {
                        highestValuePostiveAndNegative = sumPN;
                    }
                }

                // Here highest incase all value is negative
                if(highestOfAllValues < y[i]) {
                    highestOfAllValues = y[i];
                }
            }

            if(highestValuePostiveAndNegative != 0) {
                System.out.println(highestValuePostiveAndNegative + " " + sumP);
            } else {
                System.out.println(highestOfAllValues + " "+highestOfAllValues);
            }
        }
    }
}
