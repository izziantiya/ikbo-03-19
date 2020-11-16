package PR7;


import java.util.*;

public class DoubleListGame {
    public static String game(List<Double> first, List<Double> second) {
        int c = 0;
        for (int i = 0; i < 106; i++) {
            c++;
            if (((first.get(0) == 0) && (second.get(0) == 9)) ||
                    (first.get(0) > second.get(0)) &&
                            ((first.get(0) != 9) && (second.get(0) != 0))) {
                first.add(first.get(0));
                first.add(second.get(0));
            } else if (first.get(0) < second.get(0) ||
                    ((first.get(0) == 9) && (second.get(0) == 0))) {
                second.add(first.get(0));
                second.add(second.get(0));
            }
            second.remove(0);
            first.remove(0);
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
        List<Double> first = new ArrayList<>();
        List<Double> second = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            first.add(in.nextDouble());
        }
        for (int i = 0; i < 5; i++) {
            second.add(in.nextDouble());
        }
        System.out.println(game(first, second));
    }
}
