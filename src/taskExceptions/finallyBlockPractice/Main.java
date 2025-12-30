package taskExceptions.finallyBlockPractice;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block. This will always execute.");
        }
        System.out.println("Program continues after try-catch-finally.");
    }
}
