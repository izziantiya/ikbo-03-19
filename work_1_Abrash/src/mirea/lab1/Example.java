package mirea.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static int fact(int num) {
        int result = 1;
        for (int i = 1; i <=num; i ++)
            result = result*i;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 задание
        {
            int[] Array = new int[20];

            for (int i = 0; i < 20; i++)
                Array[i] = (int) (Math.random() * 100);

            for (int i = 0; i < 20; i++)
                System.out.print(Array[i] + " ");

            System.out.println();

            int end = 0;
            while (end < 20) {
                System.out.print(Array[end] + " ");
                end++;
            }

            System.out.println();

            end = 0;
            do {
                System.out.print(Array[end] + " ");
                end++;
            } while (end < 20);
        }
        //2 задание
        {

            for (int str = 0; str < args.length; str++)
                System.out.print(args[str]);
        }
        //3 задание
        {
            System.out.println();
            double sum = 0;

            for (int i = 1; i <= 10;i++) {
                sum += (double)1/i;
                System.out.print(sum + " ");
            }
        }
        //4 задание
        {
            int[] Arr = new int[20];

            for (int i = 0; i < 20; i++)
                Arr[i] = (int) (Math.random() * 100);

            System.out.println();

            for (int i = 0; i < 20; i++)
                System.out.print(Arr[i] + " ");

            System.out.println();
            Arrays.sort(Arr);

            for (int i = 0; i < 20; i++)
                System.out.print(Arr[i] + " ");
        }
        //5 задание
        {
            System.out.println();
            int num = scanner.nextInt();
            System.out.println(fact(num));
        }
    }
}
