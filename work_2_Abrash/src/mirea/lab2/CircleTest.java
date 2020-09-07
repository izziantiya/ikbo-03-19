package mirea.lab2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.setRadius(10);
        System.out.println(circle);

        System.out.println("Площадь: " + circle.getSquare());
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Длина дуги: " + circle.getArcLength());

    }
}
