package generalTasksForOOP.bankSystem;

public abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBalance){
        this.balance=newBalance;
    }

    public abstract void deposit(double amount);


    public abstract void withdraw(double amount);

}
