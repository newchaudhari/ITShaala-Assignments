package _5_if_Else;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        //Write a program to check if a year is leap year or not.
        //
        //If a year is divisible by 4 then it is leap year but
        // if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();

        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
