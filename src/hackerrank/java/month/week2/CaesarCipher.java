package hackerrank.java.month.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        int totalchange = k % 26;

        Map<Character, Integer> mapvalue = new HashMap<>();
        assignIntegerValueInCharacter(mapvalue);

        String resultString = "";

        for (Character c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                resultString = resultString + (Character.isUpperCase(c) ?
                        Character.toUpperCase(changeCharacterPlace(Character.toLowerCase(c), totalchange, mapvalue)) : changeCharacterPlace(c, totalchange, mapvalue));
            } else {
                resultString = resultString + c;
            }
        }

        System.out.println(resultString);
    }

    public static void assignIntegerValueInCharacter(Map<Character, Integer> mapvalue) {
        int g = 1;
        for (Character z = 'a'; z <= 'z'; z++) {
            mapvalue.put(z, g);
            g++;
        }
    }

    public static Character changeCharacterPlace(Character h, int position, Map<Character, Integer> mapvalue) {

        int newPosition = mapvalue.get(h) + position;
        if (newPosition > 26) {
            // add with a so less then 1 27
            position = newPosition - 27;
            return (char) ('a' + position);
        }
        return (char) (h + position);
    }
}
