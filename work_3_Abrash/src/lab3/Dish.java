package lab3;

public abstract class Dish {
    private final String material;
    private int price;
    private final String color;

    public Dish(String material, String color, int price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
