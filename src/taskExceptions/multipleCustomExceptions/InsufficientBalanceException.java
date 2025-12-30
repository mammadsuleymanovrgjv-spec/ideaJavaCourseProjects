package taskExceptions.multipleCustomExceptions;

public class InsufficientBalanceException extends RuntimeException {
    final String message = "Balance is insufficient";

    @Override
    public String getMessage() {
        return message;
    }
}
