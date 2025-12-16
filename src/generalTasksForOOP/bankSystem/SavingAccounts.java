package generalTasksForOOP.bankSystem;

public class SavingAccounts extends BankAccount {
    private final double limit;

    public SavingAccounts(double balance, double limit) {
        super(balance);
        this.limit = limit;
        System.out.println("Saving account created!");

    }

    @Override
    public void deposit(double amount)
        {
            if (amount <= 0) {
                System.out.println("Invalid amount");
            } else {
                double balance = getBalance();
                balance += amount;
                System.out.println(amount + " successfuly added to saving account!");
                System.out.println("Balance : " + balance);
                setBalance(balance);
            }
        }


    @Override
    public void withdraw(double amount)
        {
            if (amount <= 0) {
                System.out.println("Invalid amount");
            } else {
                double balance = getBalance();
                if (balance < amount) {
                    System.out.println("Not enough money in your balance saving account");
                } else if (amount >= limit) {
                    System.out.println("You don't withdraw. Because your withdrawn amount ("+amount+") limited in saving account");
                    System.out.println("Balance : " + balance);
                    setBalance(balance);
                } else {
                    balance -= amount;
                    System.out.println(amount + " successfuly withdrawn from saving account!");
                    System.out.println("Balance : " + balance);
                    setBalance(balance);

                }
            }


    }
}
