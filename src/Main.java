public class Main {
    public static void main(String[] args) {
        // region Car
        Car car = new Car();
        car.setBranch("Toyota");
        System.out.println(car.getBranch());
        car.setModel("Rav4");
        System.out.println(car.getModel());
        car.setYear(2009);
        System.out.println(car.getYear());
        //endregion

    }
}
