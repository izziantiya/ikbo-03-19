package lab4;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Пушок");
        System.out.println(cat.getName());
        cat.setName("Кефир");
        System.out.println(cat.getName());

        Dog dog = new Dog("Шарик");
        System.out.println(dog.getName());
        dog.setName("Торпеда");
        System.out.println(dog.getName());
    }
}
