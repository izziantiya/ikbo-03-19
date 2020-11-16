package PR7;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueGame {
    public static String game(Queue<Integer> first, Queue<Integer> second) {
        int c = 0;
        for (int i = 0; i < 106; i++) {
            c++;
            if (((first.element() == 0) && (second.element() == 9)) ||
                    (first.element() > second.element()) &&
                            ((first.element() != 9) && (second.element() != 0))) {
                first.add(first.element());
                first.add(second.element());
            } else if (first.element() < second.element() ||
                    ((first.element() == 9) && (second.element() == 0))) {
                second.add(first.element());
                second.add(second.element());
            }
            second.remove(second.element());
            first.remove(first.element());
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
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            first.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.add(in.nextInt());
        }
        System.out.println(game(first, second));
    }
}
