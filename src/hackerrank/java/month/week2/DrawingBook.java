package hackerrank.java.month.week2;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int firstOne = p / 2;
        //System.out.println(firstOne);

        int secondOne = (n - p) / 2;
        
        if (n % 2 == 0 && p + 1 == n) {
            secondOne = 1;
        }

        System.out.println(firstOne > secondOne ? secondOne : firstOne);
    }
}
