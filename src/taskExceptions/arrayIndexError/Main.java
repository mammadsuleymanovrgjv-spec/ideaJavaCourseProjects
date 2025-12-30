package taskExceptions.arrayIndexError;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i <= numbers.length; i++) {
                numbers[i] = scanner.nextInt();
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
