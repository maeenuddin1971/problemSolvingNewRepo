package hackerrank.java.month.week3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gh = scanner.nextInt();

        for (int vd = 0; vd < gh; vd++) {
            int m = scanner.nextInt();

            int n = scanner.nextInt();

            List<Integer> p = new ArrayList<>();
            Map<Integer, Integer> totalNumber = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int input = scanner.nextInt();
                p.add(input);
                totalNumber.put(input, totalNumber.getOrDefault(input, 0) + 1);
            }

            //System.out.println(totalNumber);

            Map<Integer, Integer> allCouple = new HashMap<>();

            for (int u = 1; u <= m / 2; u++) {
                allCouple.put(u, m - u);
            }

            //System.out.println(allCouple);
            List<Integer> finalPositions = new ArrayList<>();

            for (Integer key : allCouple.keySet()) {
                if (totalNumber.containsKey(key) && totalNumber.containsKey(allCouple.get(key))) {
                    if (key == allCouple.get(key)) {
                        finalPositions.add(p.indexOf(key) + 1);
                        finalPositions.add(p.lastIndexOf(key) + 1);
                    } else {
                        finalPositions.add(p.indexOf(key) + 1);
                        finalPositions.add(p.indexOf(allCouple.get(key)) + 1);
                    }
                    break;
                }
            }

            Collections.sort(finalPositions);

            System.out.println(finalPositions.get(0) + " " + finalPositions.get(1));

        }
    }
}
