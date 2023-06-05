package hackerrank.java;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String timeString = r.nextLine();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");

        LocalTime localTime = LocalTime.parse(timeString, inputFormatter);

        // Define the output format
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Convert to 24-hour format
        String formattedTime = localTime.format(outputFormatter);

        System.out.println(formattedTime);
    }
}
