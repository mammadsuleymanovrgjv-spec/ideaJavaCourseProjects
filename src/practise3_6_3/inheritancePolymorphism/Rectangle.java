package practise3_6_3.inheritancePolymorphism;

public class Rectangle extends Shape {
    double width;
    double heigh;

    public Rectangle(double width, double height) {
        this.width = width;
        this.heigh = height;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle: " + (width * heigh));
    }
}
