package pr3;

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1,2 ,4, 5, 4, 8);

        rectangle.moveUp();
        rectangle.moveDown();
        rectangle.moveLeft();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
