package LAB16;

public enum DrinkType {
    BEER("alcohol"),
    WINE("alcohol"),
    VODKA("alcohol"),
    BRANDY("alcohol"),
    CHAMPAGNE("alcohol"),
    WHISKEY("alcohol"),
    TEQUILA("alcohol"),
    RUM("alcohol"),
    VERMUTH("alcohol"),
    LIQUOR("alcohol"),
    JAGERMEISTER("alcohol"),
    JUICE("alcohol"),
    COFFEE("non-alcohol"),
    GREEN_TEA("non-alcohol"),
    BLACK_TEA("non-alcohol"),
    MILK("non-alcohol"),
    WATER("non-alcohol"),
    SODA("non-alcohol");

    private final String desc;

    DrinkType(String desc) {
        this.desc = desc;
    }

    public boolean isAlcohol() {
        return desc.equals("alcohol");
    }
}
