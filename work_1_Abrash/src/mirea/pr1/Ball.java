package mirea.pr1;

public class Ball {
    private int price;
    private String color;
    private String material;

    public Ball(String material, int price, String color) {
        this.material = material;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Мяч: " + "материал\t" + material + ", цена\t" + price + ", цвет\t" + color;
    }
}
