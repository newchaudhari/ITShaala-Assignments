package _5_if_Else;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        //Take two int values from user and print greatest among them.
        Scanner scanner=new Scanner(System.in);
        System.out.println("number 1");
        int number1= scanner.nextInt();
        System.out.println("Number 2");
        int number2 = scanner.nextInt();
        if(number1>number2){
            System.out.println(number1);
        }else {
            System.out.println(number2);
        }
    }
}
