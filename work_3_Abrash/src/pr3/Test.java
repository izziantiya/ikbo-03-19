package pr3;

public class Test {
    public static void main(String[] args) {

        Shape s1 = new Circle("RED", false, 5.5); //приводим тип класса наследника к классу родителя
        System.out.println(s1); //будет вызван метод toString из класса Circle
        System.out.println(s1.getArea()); //будет вызван метод вычисления площади из класса Circle
        System.out.println(s1.getPerimeter()); //будет вызван метод вычисления периметра из класса Circle
        System.out.println(s1.getColor()); //будет вызван метод получения цвета из класса Shape
        System.out.println(s1.isFilled()); //будет вызван метод заливки из класса Shape
        //System.out.println(s1.getRadius()); //метода getRadius нет в классе Shape

        Circle c1 = (Circle) s1; //приводим обратно к классу наследника
        System.out.println(c1); //будет вызван метод toString из класса Circle
        System.out.println(c1.getArea()); // будет вызван метод вычисления площади из класса Circle
        System.out.println(c1.getPerimeter()); // будет вызван метод вычисления периметра из класса Circle
        System.out.println(c1.getColor()); //будет вызван метод получения цвета из класса Shape
        System.out.println(c1.isFilled()); //будет вызван метод заливки из класса Shape
        System.out.println(c1.getRadius()); //будет вызван метод  получения радиуса из класса Circle

        //Shape s2 = new Shape(); //нельзя создать экземпляр абстрактного класса Shape

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); //приводим тип класса наследника к классу родителя
        System.out.println(s3); //будет вызван метод toString из класса Rectangle
        System.out.println(s3.getArea()); //будет вызван метод вычисление площади из класса Rectangle
        System.out.println(s3.getPerimeter()); //будет вызван метод вычисления периметра из класса Rectangle
        System.out.println(s3.getColor()); //будет вызван метод получения цвета из класса Shape
        //System.out.println(s3.getLength()); //метода getLength нет в классе Shape

        Rectangle r1 = (Rectangle) s3; //приводим обратно к классу наследника
        System.out.println(r1); //будет вызван метод toString из класса Rectangle
        System.out.println(r1.getArea()); //будет вызван метод вычисления периметра из класса Rectangle
        System.out.println(r1.getColor()); //будет вызван метод получения цвета из класса Shape
        System.out.println(r1.getLength()); //будет вызван метод получения длины из класса Rectangle

        Shape s4 = new Square(6.6); //приводим тип класса наследника к классу родителя
        System.out.println(s4); //будет вызван метод toString из класса Square
        System.out.println(s4.getArea()); //будет вызван метод вычисления площади из класса Rectangle
        System.out.println(s4.getColor()); //будет вызван метод получения цвета из класса Shape
        //System.out.println(s4.getSide()); //метода getSide нет в классе Shape

        Rectangle r2 = (Rectangle) s4; //приводим к типу класса rectangle
        System.out.println(r2); //будет вызван метод toString из класса Square
        System.out.println(r2.getArea()); //будет вызван метод вычисления площади из класса Rectangle
        System.out.println(r2.getColor()); //будет вызван метод получения цвета из класса Shape
        //System.out.println(r2.getSide()); // метода getSide нет в классе Rectangle
        System.out.println(r2.getLength()); //будет вызван метод получения длины из класса Rectangle

        Square sq1 = (Square) r2; //приводим к типу square
        System.out.println(sq1); //будет вызван метод toString из класса Square
        System.out.println(sq1.getArea()); //будет вызван метод вычисления площади из класса Rectangle
        System.out.println(sq1.getColor()); //будет вызван метод получения цвета из класса Shape
        System.out.println(sq1.getSide()); // будет вызван метод получения стороны из класса Square
        System.out.println(sq1.getLength()); //будет вызван метод получения длины из класса Rectangle
    }
}
