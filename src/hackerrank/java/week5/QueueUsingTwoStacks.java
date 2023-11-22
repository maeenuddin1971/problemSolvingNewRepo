package hackerrank.java.week5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int q = r.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < q; i++) {
            int enm = r.nextInt();

            if (enm == MyEnum.VALUE1.value) {
                int gf = r.nextInt();
                queue.add(gf);
            } else if (enm == MyEnum.VALUE2.value) {
                queue.poll();
            } else if (enm == MyEnum.VALUE3.value) {
                System.out.println(queue.peek());
            }
        }
    }

    public enum MyEnum {
        VALUE1(1),
        VALUE2(2),
        VALUE3(3);

        private final int value;

        MyEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
