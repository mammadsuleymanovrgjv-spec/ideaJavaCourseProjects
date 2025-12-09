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
        // region Student
        Student student = new Student("Jhon", 22);
        Student student2 = new Student("Alex", 25);
        student.displayInfo();
        student2.displayInfo();
        // endregion
        //region Book
        Book book = new Book();
        Book book2 = new Book("Romeo and Juliet", "Shakespeare");
        Book book3 = new Book("Robinson", "Daniel Depho", 13.99);
        //endregion
        // region Person
        Person person = new Person();
        person.setName("Jhon");
        person.setHeight(187);
        person.personInfo(person);
        // endregion
        // region Engine
        EngineCar engineCar=new EngineCar(new Engine(750));
        engineCar.startCar();
        // endregion
    }
}
