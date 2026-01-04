package practise3_6_3.exceptionHandling;

public class DivideByZeroException extends Exception {
    String message;

    public DivideByZeroException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
