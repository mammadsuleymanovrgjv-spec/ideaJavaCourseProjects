package inheritance.exercise5;

public class Main {
    public static void main(String[] args) {
       Employee [] employees={
               new Manager(1500),
               new Developer(2500)
       };
       for(Employee e:employees){
          e.calculateSalary();
       }
    }
}
