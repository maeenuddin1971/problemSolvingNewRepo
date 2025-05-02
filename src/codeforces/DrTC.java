package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DrTC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int u = 0; u < n; u++) {
            int t = scanner.nextInt();
            scanner.nextLine();
            String binaryString = scanner.nextLine();
            Map<Integer, Integer> km = new HashMap<>();

            if (binaryString.length() == 1) {
                if (binaryString.contains("1")) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else if (binaryString.length() == 2) {
                System.out.println(2);
            } else {
                for (Character c : binaryString.toCharArray()) {
                    if(c == '1') {
                        km.put(1, km.getOrDefault(1, 0) + 1);
                    }
                    else {
                        km.put(0, km.getOrDefault(0, 0) + 1);
                    }
                }

                //System.out.println(km);

                if(km.containsKey(1) && km.containsKey(0)) {
                    int total = km.get(1) * (km.get(1)-1) + km.get(0) * (km.get(1) + 1);
                    System.out.println(total);
                } else if(km.containsKey(1)){
                    System.out.println(km.get(1) * (km.get(1)-1));
                } else {
                    System.out.println(binaryString.length());
                }
            }


        }
    }
}
