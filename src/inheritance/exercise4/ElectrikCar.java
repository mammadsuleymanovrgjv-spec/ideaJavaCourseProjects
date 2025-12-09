package inheritance.exercise4;

public class ElectrikCar extends Car {
    private String brand;

    public ElectrikCar(String kindVehicle, String branch, String brand) {
        super(branch, kindVehicle);
        this.brand = brand;
    }

    public void electricCarInfo() {
        System.out.println("This is a " + brand);
    }
}
