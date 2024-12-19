package hackerrank.java.month.week3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndValidString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gh = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        Set<Integer> pm = new HashSet<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Boolean isValid;

        for (Character c : gh.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c = 'a'; c <= 'z'; c++) {
            if (map.containsKey(c)) {
                pm.add(map.get(c));
                map1.put(map.get(c), map1.getOrDefault(map.get(c), 0) + 1);
            }
        }

        if (pm.size() > 2) {
            System.out.println("NO");
        } else {
            if (pm.size() == 1) {
                System.out.println("YES");
            } else {
                Integer[] mapNumbers = map1.keySet().toArray(new Integer[0]);

                if (map1.get(mapNumbers[0]) == 1 || map1.get(mapNumbers[1]) == 1 &&
                        (Math.abs(mapNumbers[1] - mapNumbers[0])) == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
