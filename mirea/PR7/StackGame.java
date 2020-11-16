package PR7;


import java.util.Scanner;
import java.util.Stack;

public class StackGame {
    public static String game(Stack<Integer> first, Stack<Integer> second) {
        int c = 0;
        for (int i = 0; i < 106; i++) {
            c++;
            if (((first.get(0) == 0) && (second.get(0) == 9)) ||
                    first.get(0) > second.get(0) && ((first.get(0) != 9) && (second.get(0) != 0))) {
                first.add(first.get(0));
                first.add(second.get(0));
            } else if (first.get(0) < second.get(0) || ((first.get(0) == 9) &&
                    (second.get(0) == 0))) {
                second.add(first.get(0));
                second.add(second.get(0));
            }
            second.remove(0);
            first.remove(0);
            if (second.empty()) {
                return "first " + c;
            } else if (first.empty()) {
                return "second " + c;
            }
        }
        return "botva";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        for (int i = 0; i < 5; i++) {
            first.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.add(in.nextInt());
        }
        System.out.println(game(first, second));
    }
}
