package _4_inputByUser;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        //Take two different string input and print them in same line. E.g.-
        //
        //INPUT : Codes
        //
        //Dope
        //
        //OUTPUT : CodesDope

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first String");
        String st1= scanner.nextLine();

        System.out.println("Enter second String");
        String st2= scanner.nextLine();

        System.out.println(st1+st2);
    }
}
