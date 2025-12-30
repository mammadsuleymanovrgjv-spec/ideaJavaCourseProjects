package taskExceptions.bankAccountSimulation;

public class NotEnoughBalanceException extends Exception{
    final String message = "Balance is not enough for withdrawing procces";

    @Override
    public String getMessage() {
        return message;
    }
}
