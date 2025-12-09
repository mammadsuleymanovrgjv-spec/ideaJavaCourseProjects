public class Employee {
    private String name;
    private double salary;
    private Adress adress;
    public Employee(String name, double salary, Adress adress) {
        this.name = name;
        this.salary = salary;
        this.adress = adress;
    }
    public void employeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        adress.adressDetails();
    }
}
