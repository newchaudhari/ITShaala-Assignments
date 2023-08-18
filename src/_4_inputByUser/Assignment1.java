package _4_inputByUser;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //Write a program to take two integer inputs from user and print sum and product of them.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number");
        int number1= scanner.nextInt();

        System.out.println("Enter second number");
        int number2= scanner.nextInt();

        System.out.println("Sum of two number "+ (number1+number2));
        System.out.println("product of two number "+ number1*number2);
    }
}
