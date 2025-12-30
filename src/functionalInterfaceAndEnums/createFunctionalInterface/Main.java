package functionalInterfaceAndEnums.createFunctionalInterface;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println(add.operate(10, 20));
        Calculator multiply = (a, b) -> a * b;
        System.out.println(multiply.operate(10, 20));
    }
}
