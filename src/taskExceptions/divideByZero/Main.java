package taskExceptions.divideByZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
