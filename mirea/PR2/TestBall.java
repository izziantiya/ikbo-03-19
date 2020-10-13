package mirea.PR2;

public class TestBall {
    public static void main(String[] args) {
        Ball ballOne = new Ball(1.5, 7.3);
        System.out.println(ballOne);
        ballOne.setXY(2.7, 9.2);
        System.out.println(ballOne);

        Ball ballTwo = new Ball();
        ballTwo.setX(1.1);
        ballTwo.setY(5.6);
        System.out.println(ballTwo);
        ballTwo.move(1.1, 6.7);
        System.out.println(ballTwo);
    }
}
