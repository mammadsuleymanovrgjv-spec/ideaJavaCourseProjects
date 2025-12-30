package taskExceptions.customException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            try {
                throw new InvalidAgeException("Age is not valid to vote");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}
