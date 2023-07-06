package hackerrank.java.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Week2MockTest {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < n * 2; i++) {
            List<Integer> elem = new ArrayList<>();
            for (int h = 0; h < n * 2; h++) {
                elem.add(r.nextInt());
            }
            matrix.add(elem);
        }


        int sum = 0;

        // here found this logic by researching on the problem
        for (int i = 0, p = (n * 2) - 1; i < n; i++, p--) {
            for (int h = 0, mp = (n * 2) - 1; h < n; h++, mp--) {
                Integer[] fourNumbers = new Integer[4];
                fourNumbers[0] = matrix.get(i).get(h);
                fourNumbers[1] = matrix.get(p).get(h);
                fourNumbers[2] = matrix.get(i).get(mp);
                fourNumbers[3] = matrix.get(p).get(mp);

                int largerNumber = findLargeNumberFrom4Number(fourNumbers);
                sum = sum + largerNumber;
            }
        }
        System.out.println(sum);
    }

    public static Integer findLargeNumberFrom4Number(Integer[] fourNumbers) {
        Arrays.sort(fourNumbers);
        return fourNumbers[fourNumbers.length - 1];
    }
}
