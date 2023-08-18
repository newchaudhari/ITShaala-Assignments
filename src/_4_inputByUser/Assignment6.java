package _4_inputByUser;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        //Write a program to find square of a number.
        //
        //E.g.-
        //
        //INPUT : 2 OUTPUT : 4
        //
        //INPUT : 5 OUTPUT : 25

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("Square of a given number "+number*number);
    }
}
