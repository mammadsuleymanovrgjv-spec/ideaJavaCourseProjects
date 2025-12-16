package generalTasksForOOP.bankSystem;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
        System.out.println("Checking account created!");

    }

    @Override
    public void deposit(double amount) {
        {
            if (amount <= 0) {
                System.out.println("Invalid amount");
            } else {
                double balance = getBalance();
                balance += amount;
                System.out.println(amount + " successfuly added to checking account!");
                System.out.println("Balance : " + balance);
                setBalance(balance);

            }
        }
    }
    @Override
    public void withdraw(double amount) {
        {
            if (amount <= 0) {
                System.out.println("Invalid amount");
            } else {
                double balance = getBalance();
                if (balance < amount) {
                    System.out.println("Not enough money in your balance checking account");
                } else {
                    balance -= amount;
                    System.out.println(amount + " successfuly withdrawn from checking account!");
                    System.out.println("Balance : " + balance);
                    setBalance(balance);
                }
            }
        }
    }



    @Override
    public double getBalance() {
        return super.getBalance();
    }

}
