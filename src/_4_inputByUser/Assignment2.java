package _4_inputByUser;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        //1. Take two integer inputs from user.
        //2. First calculate the sum of two then product of two.
        //3. Finally, print the sum and product of both obtained results.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number");
        int number1= scanner.nextInt();

        System.out.println("Enter second number");
        int number2= scanner.nextInt();

        int sum =number1+number2; //sum

        int product=number1*number2; //product

        System.out.println("Sum of two number "+ sum);
        System.out.println("product of two number "+ product);
    }
}
