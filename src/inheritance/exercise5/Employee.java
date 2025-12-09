package inheritance.exercise5;

public class Employee {
    private double salary;
    public Employee(double salary) {
        this.salary = salary;
    }
    public void calculateSalary(){
        System.out.println("Salary is: " + salary);
    }
}
