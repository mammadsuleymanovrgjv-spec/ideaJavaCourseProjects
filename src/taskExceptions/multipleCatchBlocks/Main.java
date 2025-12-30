package taskExceptions.multipleCatchBlocks;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
    }
}
