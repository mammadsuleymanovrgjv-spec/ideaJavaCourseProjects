package inheritance.exercise4;

public class Car extends Vehicle {
    private String branch;
    public Car(String branch, String kindVehicle) {
        super(kindVehicle);
        this.branch = branch;
    }
    public void carInfo() {
        System.out.println("This branch is "+branch);
    }
}
