package hackerrank.java.month.week1;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gh = scanner.nextLine();
        if (gh.contains("PM")) {
            System.out.println(converTimeFromPmToTimeForPm(gh));
        } else {
            System.out.println(converTimeFromPmToTimeForAm(gh));
        }
    }

    public static String converTimeFromPmToTimeForPm(String km) {
        String firstPart = km.split(":")[0];
        Integer firstPartAsInteger = Integer.parseInt(firstPart);
        if (firstPartAsInteger != 12) {
            firstPartAsInteger = firstPartAsInteger + 12;
            return firstPartAsInteger + km.substring(2, km.length() - 2);
        }
        return km.substring(0, km.length() - 2);
    }

    public static String converTimeFromPmToTimeForAm(String km) {
        String firstPart = km.split(":")[0];
        Integer firstPartAsInteger = Integer.parseInt(firstPart);
        if (firstPartAsInteger == 12) {
            return "00" + km.substring(2, km.length() - 2);
        }
        return km.substring(0, km.length() - 2);
    }

}
