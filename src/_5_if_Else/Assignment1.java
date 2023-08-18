package _5_if_Else;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //Take values of length and breadth of a rectangle from user
        // and check if it is square or not.

        Scanner scanner=new Scanner(System.in);
        System.out.println("length");
        int length= scanner.nextInt();
        System.out.println("breadth");
        int breadth= scanner.nextInt();

        if(length==breadth){
            System.out.println("It is a square");
        }else {
            System.out.println("It's not a square");
        }
    }
}
