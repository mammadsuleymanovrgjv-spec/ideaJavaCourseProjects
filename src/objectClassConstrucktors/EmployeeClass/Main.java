package objectClassConstrucktors.EmployeeClass;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jhon Doe", 2500, new Adress("Williams32", "London", 1006));
        employee.employeeDetails();
    }
}
