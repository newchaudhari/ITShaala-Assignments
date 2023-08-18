package _8_method;

import java.util.Scanner;

public class Assignment4 {
    //Write a program to print the sum of two numbers entered by user by defining your own method.
    int num1;
    int num2;

    int sum(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        return num1+num2;
    }

    public static void main(String[] args) {
        Assignment4 s1=new Assignment4();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 ");
        s1.num1 = scanner.nextInt();
        System.out.print("Enter number2 ");
        s1.num2 = scanner.nextInt();
        System.out.println("Sum of two numbers is "+s1.sum(s1.num1, s1.num2));
    }
}
