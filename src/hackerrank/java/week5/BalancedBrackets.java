package hackerrank.java.week5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        r.nextLine();
        for (int i = 0; i < n; i++) {
            String h = r.nextLine();
            Queue<Character> pm = new LinkedList<>();
            Stack<Character> ph = new Stack<>();
            Boolean isBalanced = Boolean.TRUE;
            for (Character bh : h.toCharArray()) {
                if (bh == '(' || bh == '{' || bh == '[') {
                    ph.add(bh);
                } else {
                    if (ph.size() == 0) {
                        isBalanced = Boolean.FALSE;
                        break;
                    }
                    Character gb = ph.peek();
                    if (gb == '(' && bh == ')' || gb == '{' && bh == '}' || gb == '[' && bh == ']') {
                        ph.pop();
                    } else {
                        isBalanced = Boolean.FALSE;
                        break;
                    }
                }
            }

            if (isBalanced == Boolean.FALSE) {
                System.out.println("NO");
            } else {
                if (ph.size() == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
