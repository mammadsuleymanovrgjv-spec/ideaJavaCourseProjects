
package taskExceptions.exceptionLogging;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            showException();
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause());
        }

    }

    public static void showException() {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Index is out of  bounds", e);
        }
    }

}

