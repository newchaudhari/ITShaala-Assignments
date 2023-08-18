package _7_class_and_object;

import java.util.Scanner;

public class Average1 {
    //Print the average of three numbers entered by user by creating a class named 'Average'
    // having a method to calculate and print the average
    int number1;
    int number2;
    int number3;

    Average1(int n1, int n2, int n3){
        number1=n1;
        number2=n2;
        number3=n3;
    }
    int getAverage(){
        return (number1+number2+number3)/3;
    }
    void printAverage(){
        System.out.println("Average of three numbers "+getAverage());
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numbers");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int number3= scanner.nextInt();
        Average1 a1=new Average1(number1,number2,number3);
        a1.printAverage();
    }

}
