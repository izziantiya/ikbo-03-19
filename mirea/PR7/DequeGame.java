package PR7;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeGame {
    public static String game(Deque<Integer> first, Deque<Integer> second) {
        int c = 0;
        for (int i = 0; i < 106; i++) {
            c++;
            if (((first.getFirst() == 0) && (second.getFirst() == 9)) ||
                    (first.getFirst() > second.getFirst()) &&
                            ((first.getFirst() != 9) && (second.getFirst() != 0))) {
                first.addLast(first.getFirst());
                first.addLast(second.getFirst());
            } else if (first.getFirst() < second.getFirst() ||
                    ((first.getFirst() == 9) && (second.getFirst() == 0))) {
                second.addLast(first.getFirst());
                second.addLast(second.getFirst());
            }
            second.remove(second.getFirst());
            first.remove(first.getFirst());
            if (second.size() == 0) {
                return "first " + c;
            } else if (first.size() == 0) {
                return "second " + c;
            }
        }
        return "botva";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> first = new LinkedList<>();
        Deque<Integer> second = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            first.addLast(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.addLast(in.nextInt());
        }
        System.out.println(game(first, second));
    }
}
