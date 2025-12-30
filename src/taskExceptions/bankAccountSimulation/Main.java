package taskExceptions.bankAccountSimulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(150);
        try {
            System.out.println(bankAccount.withdraw(220));
        }catch (NotEnoughBalanceException e){
            System.out.println("Exception catched: "+e.getMessage());
        }
    }
}




