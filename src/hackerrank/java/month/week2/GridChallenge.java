package hackerrank.java.month.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GridChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int u = 0; u < t; u++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            List<String> pk = new ArrayList<>();

            for (int uh = 0; uh < n; uh++) {
                pk.add(scanner.nextLine());
            }
            System.out.println(gridChallenge(pk));
        }


    }

    public static String gridChallenge(List<String> grid) {
        List<String> sortedGrid = new ArrayList<>();
        for (String hb : grid) {
            char[] pm = hb.toCharArray();
            Arrays.sort(pm);
            sortedGrid.add(new String(pm));
        }

        Boolean isGrid = Boolean.TRUE;
        for (int i = 0; i < sortedGrid.size(); i++) {
            for (int u = 0; u < sortedGrid.size(); u++) {
                try {
                    if (sortedGrid.get(u).charAt(i) > sortedGrid.get(u + 1).charAt(i)) {
                        isGrid = Boolean.FALSE;
                        break;
                    }
                } catch (Exception e) {

                }
            }
        }

        if (isGrid) {
            return "YES";
        }

        return "NO";
    }
}
