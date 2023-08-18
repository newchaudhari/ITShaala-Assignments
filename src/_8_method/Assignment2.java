package _8_method;

import java.util.Scanner;

public class Assignment2 {
    //Define a program to find out whether a given number is even or odd.
    int number;
    void evenOrOdd(int number){
        this.number=number;
        if (number%2==0){
            System.out.println("Given number is even");
        }else {
            System.out.println("Given number is odd");
        }
    }

    public static void main(String[] args) {
        Assignment2 evenOrOdd=new Assignment2();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter number: ");
        evenOrOdd.number= scanner.nextInt();
        evenOrOdd.evenOrOdd(evenOrOdd.number);
    }
}
