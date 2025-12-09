public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void getArea() {
        System.out.println("Rectangle Area : " + this.length * this.width);
    }

    public void getPerimeter() {
        System.out.println("Rectangle Perimeter : " + 2 * (this.length + this.width));


    }
}
