package taskExceptions.multipleCustomExceptions;

public class DailyLimitExceededException extends RuntimeException {
    final String message = "You had reach daily limit";

    @Override
    public String getMessage() {
        return message;
    }
}
