package hackerrank.java.week2;

import java.util.*;
import java.util.stream.Collectors;

public class LonelyInteger {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        int[] p = new int[t];

        Map<Integer, Integer> numberOfOccurance = new HashMap<>();
        Set<Integer> answer = new HashSet<>();

        for (int i = 0; i < t; i++) {
            p[i] = r.nextInt();
            if (numberOfOccurance.containsKey(p[i])) {
                numberOfOccurance.put(p[i], numberOfOccurance.get(p[i]) + 1);
            } else {
                answer.add(p[i]);
                numberOfOccurance.put(p[i], 1);
            }

            if (numberOfOccurance.get(p[i]) > 1) {
                answer.remove(p[i]);
            }
        }

        // it is guaranteed that only one number will occur for one time . So this below code should work
        System.out.println(answer.stream().
                filter(value -> numberOfOccurance.get(value) == 1).collect(Collectors.toList()).get(0));
    }
}
