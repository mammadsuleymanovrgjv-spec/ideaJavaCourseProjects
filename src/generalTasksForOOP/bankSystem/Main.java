package generalTasksForOOP.bankSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount [] accounts={
                new SavingAccounts(1000,150),
                new CheckingAccounts(1000)
        };
        for (BankAccount account:accounts){
            account.deposit(150);
            account.withdraw(100);
            account.withdraw(250);
        }
    }
}
