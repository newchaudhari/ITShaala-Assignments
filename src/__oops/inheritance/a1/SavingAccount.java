package __oops.inheritance.a1;

public class SavingAccount {
    private int accountNumber;
    private double balance;

    public SavingAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public SavingAccount() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    void deposit(int amount){
        balance=amount+balance;
    }
    void withdrawal(int amount){
        if (balance>amount){
            balance=balance-amount;
        }
    }
}
