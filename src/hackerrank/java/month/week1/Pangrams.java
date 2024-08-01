package hackerrank.java.month.week1;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pangrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        System.out.println(isPalin(s) ? "pangram" : "not pangram");
    }

    public static Boolean isPalin(String gh) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!gh.contains(String.valueOf(ch))) {
                // return false as not contains
                return Boolean.FALSE;
            }
        }
        // by default if not go at the upper condition return true
        return Boolean.TRUE;
    }

    public static Boolean isPalinWithLambda(String gh) {
        Predicate<String> isPalin = p -> IntStream.rangeClosed('a', 'z').mapToObj(c -> (char) c).
                collect(Collectors.toSet()).stream().allMatch(pk -> p.contains(pk.toString()));
        return isPalin.test(gh);
    }
}
