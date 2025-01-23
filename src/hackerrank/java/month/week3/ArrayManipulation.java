package hackerrank.java.month.week3;

import java.util.Scanner;

public class ArrayManipulation {
    /**
     * Performs array manipulation operations and returns the maximum value.
     */
    public static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 2];

        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];
            arr[a] += k;
            arr[b + 1] -= k;
        }

        long maxValue = 0;
        long currentSum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf(arr[i] + " ");
        }

        for (int i = 1; i <= n; i++) {
            currentSum += arr[i];
            maxValue = Math.max(maxValue, currentSum);
        }

        return maxValue;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read n (array size) and m (number of operations)
            String[] firstLine = scanner.nextLine().trim().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int m = Integer.parseInt(firstLine[1]);

            // Input validation
            if (n < 3 || n > 10000000) {
                System.out.println("Array size n must be between 3 and 10^7");
                return;
            }
            if (m < 1 || m > 200000) {
                System.out.println("Number of operations m must be between 1 and 2x10^5");
                return;
            }

            // Read queries
            int[][] queries = new int[m][3];
            for (int i = 0; i < m; i++) {
                String[] line = scanner.nextLine().trim().split(" ");

                // Parse the three numbers for each query
                int a = Integer.parseInt(line[0]);
                int b = Integer.parseInt(line[1]);
                int k = Integer.parseInt(line[2]);

                // Input validation
                if (a < 1 || a > n || b < 1 || b > n || a > b) {
                    System.out.println("Invalid range in query " + (i + 1) + ": a and b must be within array bounds and a <= b");
                    return;
                }
                if (k < 0 || k > 1000000000) {
                    System.out.println("Invalid k value in query " + (i + 1) + ": k must be between 0 and 10^9");
                    return;
                }

                queries[i] = new int[]{a, b, k};
            }

            // Process queries and print result
            long result = arrayManipulation(n, queries);
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
