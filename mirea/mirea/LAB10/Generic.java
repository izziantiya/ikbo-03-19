package mirea.LAB10;

import java.util.Arrays;
import java.util.List;

public class Generic {
    // 1 задание
    private <T> List<T> convertToList(T[] array) {
        return Arrays.asList(array);
    }

    public void Test1() {
        Object[] objectArray = {"Str", 1, 1.5, Boolean.FALSE};
        String[] stringArray = {"meow", "gav", "me"};
        int[] intArray = {4, 71, 5, 76, 8};
        System.out.println("Object: " + convertToList(objectArray));
        System.out.println("String: " + convertToList(stringArray));
        System.out.println("Integer: " + convertToList(Arrays.stream(intArray).boxed().toArray(Integer[]::new)));
    }

    public static void main(String[] args) {
        Generic test1 = new Generic();
        test1.Test1();

        GenericArray<Integer> num = new GenericArray<>(3);
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(num);

        GenericArray<String> str = new GenericArray<>(3);
        str.add("one");
        str.add("two");
        str.add("three");
        System.out.println(str);
    }

}
