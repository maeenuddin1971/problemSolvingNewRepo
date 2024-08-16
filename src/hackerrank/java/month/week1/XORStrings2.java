package hackerrank.java.month.week1;

import java.util.Scanner;

public class XORStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondStrng = scanner.nextLine();

        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++) {
            resultString.append(firstString.charAt(i) == secondStrng.charAt(i) ? "0" : "1");
        }

        System.out.println(resultString.toString());
    }
}
