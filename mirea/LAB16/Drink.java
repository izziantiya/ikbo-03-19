package LAB16;

public final class Drink extends MenuItem implements Alcoholable {
    private final double alcoholVol;
    private final DrinkType type;

    public Drink(double alcoholVol, DrinkType type) {
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkType getType() {
        return type;
    }

    public boolean isAlcoholicDrink() {
        return type.isAlcohol();
    }

    public double getAlcoholVol() {
        return alcoholVol;
    }
}
