package mirea.PR5;

import java.util.Scanner;
// реализуются задания 1-5 по варианту

public class Recursion {
    public static void foo1(int n) {
        int num = 1;
        int repeat = 0;

        for(int i=0; i < n; i++) {
            System.out.print(num + " ");
            repeat++;
            if (repeat == num) {
                repeat = 0;
                num++;
            }
        }
    }

    public static void foo2(int n) {
        if (n < 1) {
            System.out.println("Число не может быть меньше 1!");
        }
        if (n > 1) {
            foo2(n - 1);
        }
        System.out.print(n + " ");
    }

    public static void foo3(int A, int B) {
        if (A > B) {
            System.out.print(A + " ");
            foo3(A - 1, B);
        }
        else if (A < B) {
            foo3(A, B - 1);
            System.out.print(B + " ");
        }
        else
            System.out.print(A + " ");
    }

    public static int foo4(int k, int d, int sum, int length) {
        int cnt = 0;
        if (k == length && d == sum)
            return 1;
        else if (k <= length)
            return 0;
        else {
            for (int i = (length == 0) ? 1 : 0; i < 10; i++) {
                cnt += foo4(k, d, sum + i, length + 1);
            }
        }
        return cnt;
    }

    public static int foo5(int N) {
        if (N < 0)
            System.out.println("Число не может быть меньше 0!");
        return  (N != 0) ? foo5(N / 10) + (N % 10) : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--1 задание--");
        System.out.println("Введите число n:");
        foo1(sc.nextInt());
        System.out.println();

        System.out.println("--2 задание--");
        System.out.println("Введите число n:");
        foo2(sc.nextInt());
        System.out.println();

        System.out.println("--3 задание--");
        System.out.println("Введите число A:");
        int A = sc.nextInt();
        System.out.println("Введите число B:");
        int B = sc.nextInt();
        foo3(A, B);
        System.out.println();

        System.out.println("--4 задание--");
        System.out.println("Введите число k:");
        int k = sc.nextInt();
        System.out.println("Введите число d:");
        int d = sc.nextInt();
        System.out.println("Количество чисел: " + foo4(k, d, 0, 0));
        System.out.println();

        System.out.println("--5 задание--");
        System.out.println("Введите число n:");
        System.out.println(foo5(sc.nextInt()));
    }
}
