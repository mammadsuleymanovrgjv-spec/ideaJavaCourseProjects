package practise3_6_3.inheritancePolymorphism;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle :" + Math.PI * (Math.pow(radius, 2)));
    }
}
