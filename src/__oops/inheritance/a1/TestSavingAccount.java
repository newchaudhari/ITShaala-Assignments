package __oops.inheritance.a1;

public class TestSavingAccount {
    public static void main(String[] args) {

        SavingAcInterest account = new SavingAcInterest(100,5000,6);

        System.out.println("Account Details: "+account.getAccountNumber()+"\t"+account.getBalance()+"\t"+account.getInterest());


        account.deposit(5000);
        System.out.println("Account Details: "+account.getAccountNumber()+"\t"+account.getBalance()+"\t"+account.getInterest());


        account.withdrawal(10000);
        System.out.println("Account Details: "+account.getAccountNumber()+"\t"+account.getBalance()+"\t"+account.getInterest());

        SavingAcInterest ac1=new SavingAcInterest();
        System.out.println("Account Details: "+ac1.getAccountNumber()+"\t"+ac1.getBalance()+"\t"+ac1.getInterest());
        ac1.setAccountNumber(56);
        ac1.setBalance(60000);
        ac1.setInterest(8.6);
        System.out.println("Account Details: "+ac1.getAccountNumber()+"\t"+ac1.getBalance()+"\t"+ac1.getInterest());
        ac1.deposit(40000);
        System.out.println("Account Details: "+ac1.getAccountNumber()+"\t"+ac1.getBalance()+"\t"+ac1.getInterest());
        ac1.withdrawal(86490);
        System.out.println("Account Details: "+ac1.getAccountNumber()+"\t"+ac1.getBalance()+"\t"+ac1.getInterest());

    }
}
