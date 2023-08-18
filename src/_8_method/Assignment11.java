package _8_method;

import java.util.Scanner;

public class Assignment11 {
    //Define a method to print the prime factors of a number.
    int number;
    void primeFactors(int number){
        this.number=number;
        for (int i = 2; i <=number ; i++) {
        while (number%i==0){
            number=number/i;
            System.out.print(i+",");
        }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Assignment11 pf1=new Assignment11();
        System.out.println("enter number ");
        pf1.number= scanner.nextInt();
        pf1.primeFactors(pf1.number);
    }
}
