package _4_inputByUser;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        //Take name, roll number and field of interest from user and print in the format below :
        //
        //Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter Roll number");
        int rollNumber= scanner.nextInt();

        System.out.println("Enter field of interest");
        Scanner scanner1=new Scanner(System.in);
        String interest = scanner1.nextLine();


        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNumber+". My field of interest are "+interest);
    }
}
