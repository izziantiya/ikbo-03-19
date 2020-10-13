package mirea.LAB3;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate("фарфор", "белый с голубыми цветочками", 500, 20);
        System.out.println(plate);

        Cup cup = new Cup("стекло", "рыжая c котенком", 1350, 500);
        System.out.println(cup);
    }
}
