package taskExceptions.bankAccountSimulation;

public class BankAccount {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public double withdraw(double amount) throws NotEnoughBalanceException {
        if (balance >= amount) {
            balance -= amount;
            return balance;
        } else {
            throw new NotEnoughBalanceException();
        }
    }
}

