package lab7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class TestArrayList {
    public static void rand(ArrayList<Integer> list, int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            list.add(rand.nextInt(100));
    }

    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<Integer>();
        ArrayList<Integer> listTwo = new ArrayList<Integer>(15);

        System.out.println(listOne.size());
        rand(listOne, 5);
        System.out.println(listOne.size());
        System.out.println(listOne);
        System.out.println(listOne.get(3));
        listOne.remove(3);
        System.out.println(listOne.get(3));
        System.out.println(listOne.size());

        System.out.println("_____________________________________________");

        System.out.println(listTwo.size());
        rand(listTwo, 10);
        System.out.println(listTwo.size());
        System.out.println(listTwo);
        System.out.println(listTwo.subList(2, 5));

        System.out.println("_____________________________________________");

        System.out.println(listOne);
        System.out.println(listTwo);
        listTwo.addAll(listOne);
        System.out.println(listTwo);
        System.out.println(listTwo.size());


    }
}
