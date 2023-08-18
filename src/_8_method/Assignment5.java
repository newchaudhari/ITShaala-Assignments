package _8_method;

import java.util.Scanner;

public class Assignment5 {
    //Define a method that returns the product of two numbers entered by user.
    int num1;
    int num2;

    int product(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        return num1*num2;
    }

    public static void main(String[] args) {
        Assignment5 p=new Assignment5();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 ");
        p.num1 = scanner.nextInt();
        System.out.print("Enter number2 ");
        p.num2 = scanner.nextInt();
        System.out.println("Product of two numbers is " + p.product(p.num1,p.num2));
    }
}
