package hackerrank.java.month.week2;

import java.util.Scanner;

public class TowerBreakers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            // If any of them is 1 , then player 1 win
            if( m == 1) {
                System.out.println(2);
            } else if (n % 2 != 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
