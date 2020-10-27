package PR8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author izziantiya
 * @version 1.0
 */
public class Test {
    /**
     * @param list - interface
     */
    private static void test(IWaitList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        System.out.println(list);
        System.out.println("contains 1: " + list.contains(1));
        System.out.println("contains 7: " + list.contains(7));
        System.out.println("remove first: " + list.remove());
        System.out.println("is empty: " + list.isEmpty());
        List<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(4);
        test.add(5);
        System.out.println("contains test-list: " + list.containsAll(test));
        System.out.println();
    }

    public static void main(String[] args) {
        IWaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
        IWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        test(boundedWaitList);
        test(unfairWaitList);
    }
}
