package hasibReqProject;

import java.util.Scanner;

public class HasibExcelProject {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();

        for (int h = 1, i = 1; i <= n; h++, i++) {
            if (h % 5 == 0) {
                System.out.printf("  ");
                i--;
            } else {
                System.out.printf(i + " ");
            }

            if (h % 7 == 0) {
                System.out.println();
            }
        }
    }
}
