package mirea.LAB2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius > 0)
            this.radius = radius;
        else System.out.println("Ошибка! Радиус должен быть больше 0.");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return Math.PI*radius*radius;
    }

    public double getArcLength() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Радиус окружности: " + radius + "\tПлощадь: " + getSquare() + "\tДлина дуги: " + getArcLength();
    }
}
