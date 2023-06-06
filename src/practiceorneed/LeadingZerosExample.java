package practiceorneed;

public class LeadingZerosExample {
    public static void main(String[] args) {
        int number = 1; // Example number

        String formattedNumber = String.format("%05d", number);
        System.out.println(formattedNumber);
    }
}
