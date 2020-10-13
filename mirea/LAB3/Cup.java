package mirea.LAB3;

public class Cup extends Dish {
    private int volume;

    public Cup(String material, String color, int price, int volume) {
        super(material, color, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Кружка { " +  " материал = " + getMaterial() + " цвет = " + getColor() + " цена = " + getPrice() +
                " объем = " + volume + " }";
    }
}
