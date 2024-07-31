package hackerrank.java.month.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        //int[][] p = new int[t][t];
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();

        for (int uh = 0; uh < t; uh++) {
            twoDList.add(new ArrayList<>());
            for (int gb = 0; gb < t; gb++) {
                int gh = scanner.nextInt();
                twoDList.get(uh).add(gh);
            }
        }

        // Here sum for the first diagonal and sum2 is the second diagonal
        int sum = 0;
        int sum2 = 0;

        // Here tsum is first diagonal array trverse and tsum2 is the second array traverse
        int tsum = 0;
        int tsum2 = t - 1;

        for (int uh = 0; uh < t; uh++) {
            sum = sum + twoDList.get(uh).get(tsum);
            sum2 = sum2 + twoDList.get(uh).get(tsum2);
            tsum++;
            tsum2--;
        }
        System.out.println(Math.abs(sum-sum2));
    }
}
