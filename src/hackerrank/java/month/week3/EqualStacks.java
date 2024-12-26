package hackerrank.java.month.week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class EqualStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();

        Queue<Integer> h1 = new LinkedList<>();
        Queue<Integer> h2 = new LinkedList<>();
        Queue<Integer> h3 = new LinkedList<>();
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int ip = 0; ip < t; ip++) {
            int value1 = scanner.nextInt();
            h1.add(value1);
            sum1 = sum1 + value1;
        }

        for (int u = 0; u < g; u++) {
            int value2 = scanner.nextInt();
            h2.add(value2);
            sum2 = sum2 + value2;
        }

        for (int hb = 0; hb < h; hb++) {
            int value3 = scanner.nextInt();
            h3.add(value3);
            sum3 = sum3 + value3;
        }

        Set<Integer> sum1Set = new HashSet<>();
        List<Integer> sum1List = new ArrayList<>();
        sum1Set.add(sum1);
        sum1List.add(sum1);
        Set<Integer> sum2Set = new HashSet<>();
        sum2Set.add(sum2);
        Set<Integer> sum3Set = new HashSet<>();
        sum3Set.add(sum3);

        while (!h1.isEmpty()) {
            Integer element = h1.poll();
            sum1 = sum1 - element;
            sum1Set.add(sum1);
            sum1List.add(sum1);
        }

        while(!h2.isEmpty()) {
            Integer element = h2.poll();
            sum2 = sum2 - element;
            sum2Set.add(sum2);
        }

        while(!h3.isEmpty()) {
            Integer element = h3.poll();
            sum3 = sum3 - element;
            sum3Set.add(sum3);
        }
        

        for(Integer fg : sum1List) {
            if(sum3Set.contains(fg) && sum2Set.contains(fg)) {
                System.out.println(fg);
                break;
            }
        }

    }
}
