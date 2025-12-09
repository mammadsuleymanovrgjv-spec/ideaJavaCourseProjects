public class EngineCar {
    private Engine engine;

    public EngineCar(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
       engine.startEngine();

    }

}
