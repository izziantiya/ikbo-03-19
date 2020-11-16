package PR11.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Subtract(
                                new Multiply(
                                        new Const(2),
                                        new Variable("x")),
                                new Const(3))
                            .evaluate(5));

        System.out.println("_______________________");

        Scanner sc = new Scanner(System.in);
        System.out.println("x:");
        int x = sc.nextInt();
        System.out.println("Результат:");
        System.out.print(
                new Add(
                        new Subtract(
                                new Multiply(
                                        new Variable("x"),
                                        new Variable("x")
                                ),
                                new Multiply(
                                        new Const(2),
                                        new Variable("x")
                                )
                        ),
                        new Const(1)
                ).evaluate(x));

    }
}
