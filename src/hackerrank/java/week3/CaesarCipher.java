package hackerrank.java.week3;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int stringLength = r.nextInt();
        r.nextLine();
        String inputString = r.nextLine();
        String encryptedString = "";
        int shiftAmount = r.nextInt() % 26;

        for (char currentChar : inputString.toCharArray()) {
            if (Character.isLetter(currentChar) && Character.isLowerCase(currentChar)) {
                char shiftedChar = (char) (currentChar + shiftAmount);
                if (shiftedChar > 'z') {
                    shiftedChar = (char) ('a' + (shiftedChar - 'z') - 1);
                }
                encryptedString = encryptedString + shiftedChar;
            } else if (Character.isLetter(currentChar) && Character.isUpperCase(currentChar)) {
                char shiftedChar = (char) (currentChar + shiftAmount);
                if (shiftedChar > 'Z') {
                    shiftedChar = (char) ('A' + (shiftedChar - 'Z') - 1);
                }
                encryptedString = encryptedString + shiftedChar;
            } else {
                encryptedString = encryptedString + currentChar;
            }
        }
        System.out.println(encryptedString);
    }
}
