package _7_class_and_object;

import java.util.Scanner;

public class Average {
    //Print the average of three numbers entered by user
    // by creating a class named 'Average' having a method to calculate and print the average


   static int average(int number1, int number2, int number3){
        int sum= (number1+number2+number3)/3;

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number1");
        int number1= scanner.nextInt();
        System.out.println("Enter Number2");
        int number2= scanner.nextInt();
        System.out.println("Enter Number3");
        int number3= scanner.nextInt();

        int avg=average(number1,number2,number3);
        System.out.println("Average of numbers "+avg);







    }


}
