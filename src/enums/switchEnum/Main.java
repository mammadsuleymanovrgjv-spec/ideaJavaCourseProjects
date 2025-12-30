package enums.switchEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lightInput = input.nextLine().toUpperCase();
        TrafficLight light = TrafficLight.valueOf(lightInput);
        light.printAction();
    }
}
enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    public void printAction() {
        switch (this) {
            case RED -> System.out.println("Stop");
            case YELLOW -> System.out.println("Caution");
            case GREEN -> System.out.println("Go");
        }
    }
}
