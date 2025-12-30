package taskExceptions.multipleCustomExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your PIN");
        String pin = input.nextLine();
        testPin(pin);
        System.out.println("-------------------------------");
        int balance = 100;
        System.out.println("Your balance is " + balance);
        System.out.println("Enter amount for withdrawing: ");
        int amount = input.nextInt();
        input.nextLine();
        testBalance(balance, amount);
        System.out.println("-------------------------------");
        String password = "12345";
        int count = 0;
        String chance;
        while (true) {
            System.out.println("Enter your paswword");
            chance = input.nextLine();
            count++;
            if (chance.equals(password)) {
                System.out.println("Password is correct");
                break;
            }
            System.out.println("Incorrect password!");
            if (count == 3) {
                throw new DailyLimitExceededException();
            }
        }


    }

    public static void testPin(String pin) {
        if (pin.length() == 7) {
            System.out.println("Your PIN is avialabe");
        } else {
            throw new InvalidPINException();
        }
    }

    public static void testBalance(int balance, int amount) {

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Process succed!");
            System.out.println("Your balance is: " + balance);

        } else {
            throw new InsufficientBalanceException();
        }
    }
}
