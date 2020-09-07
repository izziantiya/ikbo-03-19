package mirea.pr1;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Собака: " + "возраст\t" + age + ", имя\t" + name + ", цвет\t" + color;
    }
}
