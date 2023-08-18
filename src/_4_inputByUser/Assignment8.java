package _4_inputByUser;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        //Take 3 inputs from user and check :
        //
        //all are equal
        //
        //any of two are equal
        //
        //( use **&& ||)**

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number1= scanner.nextInt();

        System.out.println("Enter number");
        int number2= scanner.nextInt();

        System.out.println("Enter number");
        int number3= scanner.nextInt();

        System.out.println(number1==number2 && number1 == number3 && number2==number3?"all are equal":"all are not equal");

        System.out.println(number1==number2 || number1==number3 || number2==number3?"two numbers are equal":"two numbers are not equal");

    }
}
