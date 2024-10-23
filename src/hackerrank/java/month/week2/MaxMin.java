package hackerrank.java.month.week2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int differ = Integer.MAX_VALUE;

        for (int u = 0; u < n; u++) {
            try {
                int instantDiffer = arr[u + k - 1] - arr[u];
                if (instantDiffer < differ) {
                    differ = instantDiffer;
                }
            } catch (ArrayIndexOutOfBoundsException m) {
                // Here actually when array index out of exception this problem will happen
                break;
            }
        }

        System.out.println(differ);
    }
}
