package enums.basicenums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayInput = scanner.nextLine().toUpperCase();
        Day day = Day.valueOf(dayInput);
        day.printDay();

    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void printDay() {
        switch (this) {

            case SATURDAY, SUNDAY -> System.out.println("It's the weekend!");
            default -> System.out.println("It's aweekday.");
        }
    }


}
