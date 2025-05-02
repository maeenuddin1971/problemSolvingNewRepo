package hackerrank.java.month.week4;

import java.util.Scanner;

public class HighestValuePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        scanner.nextLine();
        String s = scanner.nextLine();
        int totalDifferent = 0;

        for (int p = 0, c = n - 1; p < n / 2; p++, c--) {
            if (s.charAt(p) != s.charAt(c)) {
                totalDifferent++;
            }
        }

        //System.out.println(totalDifferent);
        StringBuilder sb = new StringBuilder(s);

        // because the number of change is less
        if (totalDifferent > k) {
            System.out.println("-1");
        } else {

            // already palindrooomed value will be maximise now
            if (totalDifferent == 0) {
                if (n % 2 != 0 && k == 1) {
                    sb.setCharAt(n / 2, '9');
                } else {// this condition for k > 1
                    for (int p = 0, c = n - 1; p < n / 2; p++, c--) {
                        if (k > 1) {
                            if (sb.charAt(p) == '9' && sb.charAt(c) == '9') {
                                continue;
                            } else if (sb.charAt(p) == '9' || sb.charAt(c) == '9') {
                                sb.setCharAt(p, '9');
                                sb.setCharAt(c, '9');
                                k--;
                            } else {
                                sb.setCharAt(p, '9');
                                sb.setCharAt(c, '9');
                                k = k - 2;
                            }
                        } else if (k == 1 && n % 2 != 0) {
                            sb.setCharAt(n / 2, '9');
                        }
                    }
                }
            } else {// Now which is not palindroomed

                if(totalDifferent == k) {

                } else {
                    for (int p = 0, c = n - 1; p < n / 2; p++, c--) {
                        if (k > 1) {
                            if (sb.charAt(p) == '9' && sb.charAt(c) == '9') {
                                continue;
                            } else if (sb.charAt(p) == '9' || sb.charAt(c) == '9') {
                                sb.setCharAt(p, '9');
                                sb.setCharAt(c, '9');
                                k--;
                            } else {
                                sb.setCharAt(p, '9');
                                sb.setCharAt(c, '9');
                                k = k - 2;
                            }
                        } else if (k == 1) {
                            sb.setCharAt(p, '9');
                            sb.setCharAt(c, '9');
                            k--;
                        }
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
