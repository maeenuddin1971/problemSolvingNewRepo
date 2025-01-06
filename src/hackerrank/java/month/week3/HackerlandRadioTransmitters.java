package hackerrank.java.month.week3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HackerlandRadioTransmitters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        Set<Integer> baseSet = new HashSet<>();
        TreeSet<Integer> hqTree = new TreeSet<>();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
            baseSet.add(p[i]);
            hqTree.add(p[i]);
        }

        Arrays.sort(p);
        int baseMidValue = p[0] + r;
        int baseLastValue = p[0] + 2 * r;

        if(!baseSet.contains(baseMidValue)) {
            baseMidValue = hqTree.floor(baseMidValue);
            baseLastValue = baseMidValue + r;
        }

        int sum = 1;

        for (int i = 0; i < n; i++) {
            if(p[i] <= baseLastValue) {
                continue;
            } else {
                sum++;
                baseMidValue = p[i] + r;
                baseMidValue = hqTree.floor(baseMidValue);
                baseLastValue = baseMidValue + r;
            }
        }
        System.out.println(sum);
    }
}
