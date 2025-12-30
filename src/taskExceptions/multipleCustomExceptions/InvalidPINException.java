package taskExceptions.multipleCustomExceptions;

public class InvalidPINException extends RuntimeException {
    final String message = "PIN is invalid";

    @Override
    public String getMessage() {
        return message;
    }

}
