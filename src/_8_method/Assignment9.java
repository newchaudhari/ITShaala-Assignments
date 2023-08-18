package _8_method;

import java.io.PrintStream;
import java.util.Scanner;

public class Assignment9 {
    //Write a program to print the factorial of a number by defining a method named 'Factorial'.
    //Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
    //4! = 1*2*3*4 = 24
    //3! = 3*2*1 = 6
    //2! = 2*1 = 2
    //Also,
    //1! = 1
    //0! = 0
   int number;
   int product=1;
    void factorial(){
        for (int i=1; i<=number; i++){
            if (number==0 || number==1){
                System.out.println("can't find factorial");
                break;
            }else{
                product=product*i;
            }
        }
        System.out.println("Factorial of number "+number+" is "+product);

    }

    public static void main(String[] args) {
        Assignment9 f1=new Assignment9();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter factorial number");
        f1.number= scanner.nextInt();
        f1.factorial();

    }
}
