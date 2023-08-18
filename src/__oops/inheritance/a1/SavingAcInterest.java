package __oops.inheritance.a1;

public class SavingAcInterest extends SavingAccount{
    private double interest=6.0;

    public SavingAcInterest(int accountNumber, double balance, double interest) {
        super(accountNumber, balance);
        this.interest=interest;
    }

    public SavingAcInterest() {
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
