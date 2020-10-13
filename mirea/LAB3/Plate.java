package mirea.LAB3;

public class Plate extends Dish {
    private int radius;

    public Plate(String material, String color, int price, int radius) {
        super(material, color, price);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Тарелка { " +  " материал = " + getMaterial() + " цвет = " + getColor() + " цена = " + getPrice() +
                " радиус = " + radius + " }";
    }
}
