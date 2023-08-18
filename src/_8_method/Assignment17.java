package _8_method;

import java.util.Scanner;

public class Assignment17 {
    //Create a class to print an integer and a character with two methods having the same name
    // but different sequence of the integer and the character parameters.
    //
    //For example, if the parameters of the first method are of the form (int n, char c),
    // then that of the second method will be of the form (char c, int n).
   static int n=15;
    static char c='n';
   static void printCharAndInt(int n, char c){
     Assignment17.c=c;
     Assignment17.n=n;
        System.out.println("Method 1 "+n);
        System.out.println("Method 1 "+(int) c);
    }
    static void printCharAndInt(char c, int n){
        Assignment17.c=c;
        Assignment17.n=n;
        System.out.println("Method 2 "+(int) c);
        System.out.println("Method 2 "+n);
    }

    public static void main(String[] args) {
       Assignment17.printCharAndInt(Assignment17.n,Assignment17.c);
       Assignment17.printCharAndInt(Assignment17.c,Assignment17.n);

    }
}
