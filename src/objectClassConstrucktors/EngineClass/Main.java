package objectClassConstrucktors.EngineClass;

public class Main {
    public static void main(String[] args) {
        EngineCar engineCar = new EngineCar(new Engine(750));
        engineCar.startCar();
    }
}
