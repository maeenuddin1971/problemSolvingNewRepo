package hackerrank.java.month.week1.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FlippingMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g = scanner.nextInt();
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        for (int h = 0; h < g; h++) {
            List<Integer> matrixK = new ArrayList<>();
            for (int n = 0; n < g; n++) {
                matrixK.add(scanner.nextInt());
            }
            matrix.add(matrixK);
        }

        flippingMatrix(matrix);
    }


    public static int flippingMatrix(List<List<Integer>> matrix) {

        int sum = 0;
        List<Integer> bigNumbers = new ArrayList<>();
        for (int u = 0; u < matrix.size(); u++) {
            int max = 0;
            for (int b = 0; b < matrix.size(); b++) {
                if (matrix.get(b).get(u) > max) {
                    max = matrix.get(b).get(u);
                }
            }
            bigNumbers.add(max);
        }

        Collections.sort(bigNumbers, Collections.reverseOrder());

        if(matrix.size() > 2) {
            for (int hb = 0; hb < matrix.size(); hb++) {
                sum = sum + bigNumbers.get(hb);
            }
        } else {
            sum = sum = bigNumbers.get(0);
        }

        System.out.println(sum);
        return 1;
    }
}
