package hackerrank.java.week1;

import java.util.*;

public class FindTheMedian {
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        int t=r.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i =0;i<t;i++) {
            arr.add(r.nextInt());
        }

        Collections.sort(arr);
        System.out.println(arr.get((arr.size()-1)/2));
    }
}
