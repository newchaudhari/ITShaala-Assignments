package _3_operators;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        //Write a program to calculate the sum of the digits of a 3-digit number.
        //
        //Number : 132 Output : 6
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Three digit number");
        int number=scanner.nextInt();

        int thirdDigit= number %10; //2

        number /=10; //13
        int secondDigit= number %10; //3

        number /=10; //1
        int firstDigit= number %10; //1
        int sum=firstDigit+secondDigit+thirdDigit;
        System.out.println("sum of digit "+sum);

    }
}
