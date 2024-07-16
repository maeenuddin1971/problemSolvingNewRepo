package hackerrank.java.week7;

import java.util.*;

public class NoPrefixSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String bn = scanner.nextLine();
            priorityQueue.add(bn);
            if (!map.containsKey(bn)) {
                map.put(bn, i);
            }
        }

        Boolean isOdd = Boolean.FALSE;
        String oddString = "";

        while (priorityQueue.size() != 1) {
            String hb = priorityQueue.poll();
            String bh = priorityQueue.peek();
            if (bh.startsWith(hb)) {
                isOdd = Boolean.TRUE;
                oddString = bh;
                set.add(bh);
            }
        }

        if (isOdd) {
            System.out.println(Constant.BAD_SET);
            System.out.println(minimumElementsInMap(set, map));
        } else {
            System.out.println(Constant.GOOD_SET);
        }
    }

    public static String minimumElementsInMap(Set<String> set, Map<String, Integer> map) {
        int p = Integer.MAX_VALUE;
        String finalValue = "";
        for (String gh : set) {
            int b = map.get(gh);
            if (p > b) {
                p = b;
                finalValue = gh;
            }
        }
        return finalValue;
    }

    public class Constant {
        public static final String BAD_SET = "BAD SET";
        public static final String GOOD_SET = "GOOD SET";
    }
}
