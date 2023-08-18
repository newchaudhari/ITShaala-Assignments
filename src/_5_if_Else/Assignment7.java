package _5_if_Else;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        //Write a program to print absolute value of a number entered by user. E.g.-
        //
        //INPUT: 1 OUTPUT: 1
        //INPUT: -1 OUTPUT: 1

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        if (number<0){
            int absoluteValue= (-1)*number;
            System.out.println(absoluteValue);
        }else {
            System.out.println(number);
        }
    }
}
