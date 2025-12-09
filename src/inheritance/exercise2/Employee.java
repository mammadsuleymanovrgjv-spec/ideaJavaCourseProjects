package inheritance.exercise2;


public class Employee extends Person{
    private double salary;
    public Employee(String name,int age,double salary){
        super(name,age);
        this.salary=salary;
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Salary is "+salary);
    }

}
