package taskExceptions.customException;

public class InvalidAgeException extends Exception {
    String message;

    public InvalidAgeException(String message) {
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

