package practise3_6_3.inheritancePolymorphism;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(25);
        Shape rectangle = new Rectangle(5, 4);
        circle.area();
        rectangle.area();
    }
}
