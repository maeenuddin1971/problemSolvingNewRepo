package hackerrank.java.week6;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Stack<String> textStringStack = new Stack<>();

        for (int i = 0; i < q; i++) {
            int p = scanner.nextInt();

            switch (p) {
                case 1:
                    String appendString = scanner.next();
                    appendInStack(textStringStack, appendString);
                    break;
                case 2:
                    int deleteIndexLength = scanner.nextInt();
                    deleteStringFromLastElementOfStack(textStringStack, deleteIndexLength);
                    break;
                case 3:
                    int printElement = scanner.nextInt();
                    printCharactersOfStack(textStringStack, printElement);
                    break;
                case 4:
                    undo(textStringStack);
                    break;
                default:
                    break;
            }
        }
    }

    public static void appendInStack(Stack<String> textStringStack, String appendString) {
        if (textStringStack.isEmpty()) {
            textStringStack.push(appendString);
        } else {
            String prevString = textStringStack.peek();
            textStringStack.push(prevString.concat(appendString));
        }
    }

    public static void deleteStringFromLastElementOfStack(Stack<String> textStringStack, int length) {
        String lastString = textStringStack.peek();
        textStringStack.push(lastString.substring(0, lastString.length() - length));
    }

    public static void printCharactersOfStack(Stack<String> textStringStack, int index) {
        System.out.println(textStringStack.peek().charAt(index - 1));
    }

    public static void undo(Stack<String> textStringStack) {
        textStringStack.pop();
    }
}
