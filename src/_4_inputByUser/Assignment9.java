package _4_inputByUser;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        //Write a program to enter the values of two variables 'a' and 'b' from keyboard
        // and then check if both the conditions 'a < 50' and 'a < b' are true.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();

        System.out.println("Enter second number");
        int b = scanner.nextInt();

        System.out.println(a<50 && a<b);
    }
}
