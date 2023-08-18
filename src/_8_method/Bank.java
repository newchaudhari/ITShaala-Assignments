package _8_method;

import jdk.dynalink.NamedOperation;

public class Bank {
    //A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
    // We have to print the money deposited by him in a particular bank.
    //Create a class 'Bank' with a method 'getBalance' which returns 0.
    // Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance'
    // which returns the amount deposited in that particular bank.
    // Call the method 'getBalance' by the object of each of the three banks.
    void getBalance(){
        class BankA{
            int getBalance(){
                int amount=1000;
                return amount;
            }
        }
        BankA b1=new BankA();
        System.out.println("Amount in BankA "+b1.getBalance()+"$");
        class BankB{
            int getBalance(){
               int amount=1500;
                return amount;
            }
        }
        BankB b2=new BankB();
        System.out.println("Amount in BankB "+b2.getBalance()+"$");
        class BankC{
            int getBalance(){
               int amount=2000;
                return amount;
            }
        }
        BankC b3=new BankC();
        System.out.println("Amount in BankC "+b3.getBalance()+"$");
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.getBalance();
    }
}
