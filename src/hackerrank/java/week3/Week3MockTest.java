package hackerrank.java.week3;

import java.util.Scanner;

public class Week3MockTest {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String gh = r.nextLine();
        System.out.println(palindromeIndex(gh));

        StringBuilder manik = new StringBuilder("aaadaaa");
        StringBuilder manik2 = new StringBuilder("aaadaaa");

//        if(manik2.toString().equals(manik.toString())) {
//            System.out.println("this is mollah");
//        }
//
//        StringBuilder sb1 = new StringBuilder("Hello");
//        StringBuilder sb2 = new StringBuilder("Hello");
//
//        boolean areEqual = sb1.equals(sb2); // Compares StringBuilder objects directly
//
//        System.out.println("Are sb1 and sb2 equal? " + areEqual);

    }

    public static int palindromeIndex(String s) {

        StringBuilder firstString = new StringBuilder(s);
        StringBuilder secondString = new StringBuilder(s);
        StringBuilder thirdString = new StringBuilder(s);

        if (firstString.toString().equals(thirdString.reverse().toString())) {
            return -1;
        }

        for (int gh = 0; gh < s.length(); gh++) {
            secondString.deleteCharAt(gh);
            firstString = new StringBuilder(secondString);
            if (firstString.toString().equals(secondString.reverse().toString())) {
                return gh;
            }
            secondString = new StringBuilder(s);
        }

        return -1;
    }
}
