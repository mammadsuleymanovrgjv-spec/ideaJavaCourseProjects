package practise3_6_3.exceptionHandling;

public class Main {
    public static double divide(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Don't divide to zero");
        } else {
            return a / b;
        }

    }

    public static void main(String[] args) {
        try {
            divide(1, 0);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}

