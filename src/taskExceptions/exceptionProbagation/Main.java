package taskExceptions.exceptionProbagation;

public class Main {
    public static void main(String[] args) {
        method1();
    }

    public static void method3() throws Exception {
        throw new Exception();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Method 1 catched exception: " + e.getMessage());
        }
    }
}
