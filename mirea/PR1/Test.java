package mirea.PR1;

public class Test {
    public static void main(String[] args) {
        Ball ball = new Ball("Резина", 150, "Красный");
        System.out.println(ball.toString());

        Dog dog = new Dog("Шарик", 7, "Рыжий");
        System.out.println(dog.toString());

        Book book = new Book("Пушкин", 375, 600);
        System.out.println(book.toString());
    }
}
