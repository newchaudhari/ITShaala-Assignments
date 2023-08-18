package _8_method;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Assignment11_1 {
    ///Define a method to print the prime factors of a number.
    int number;
    void primeFactors(int number){
        this.number=number;
        int temp=0;
        for (int i=2;i<=number;i++){
      while (number%i==0){
          number=number/i;
          System.out.print(i+" ");
      }
      }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        Assignment11_1 a=new Assignment11_1();
        a.number= scanner.nextInt();
        a.primeFactors(a.number);
    }
}
