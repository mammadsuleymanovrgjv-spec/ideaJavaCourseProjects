public class Engine {
    private double horsePower;
    public Engine(double horsePower) {
        this.horsePower = horsePower;
    }
    public void startEngine() {
        System.out.println("Starting Engine | horsePower : " + horsePower);
    }

}
