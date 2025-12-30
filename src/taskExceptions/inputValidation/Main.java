package taskExceptions.inputValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeNegateiveException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if (age < 0 || age > 120) {
            throw new AgeNegateiveException("Invalid age entered: " + age);
        } else {
            System.out.println("Your age is: " + age);
        }
    }
}
