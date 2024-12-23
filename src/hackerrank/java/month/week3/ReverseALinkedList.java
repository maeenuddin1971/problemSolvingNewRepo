package hackerrank.java.month.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseALinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int y = 0; y < n; y++) {
            list.add(scanner.nextInt());
        }

        for (int u = list.size() - 1; u >= 0; u--) {
            System.out.println(list.get(u));
        }
    }
}
