package _8_method;

import java.util.Scanner;

public class Assignment1 {
    //Define two methods to print the maximum and the minimum number respectively
    // among three numbers entered by user
    int number1;
    int number2;
    int number3;
    void maximum(int n1,int n2,int n3){
        number1=n1;
        number2=n2;
        number3=n3;
        if (number1>number2 && number1>number3){
            System.out.println("Number1 is greater "+number1);
        } else if (number2>number1 && number2>number3) {
            System.out.println("Number2 is greater "+number2);
        }
        else if (number3>number1 && number3>number2) {
            System.out.println("Number3 is greater "+number3);
        }else {
            System.out.println("All numbers are same "+number1);
        }
    }
    void minimum(int number1,int number2, int number3){
        this.number1=number1;
        this.number2=number2;
        this.number3=number3;
        if (number1<number2 && number1<number3){
            System.out.println("Number1 is smaller "+number1);
        } else if (number2<number1 && number2<number3) {
            System.out.println("Number2 is smaller "+number2);
        }
        else if (number3<number1 && number3<number2) {
            System.out.println("Number3 is smaller "+number3);
        }
    }

    public static void main(String[] args) {
        Assignment1 numbers=new Assignment1();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number1 ");
        numbers.number1= scanner.nextInt();
        System.out.print("Number2 ");
        numbers.number2= scanner.nextInt();
        System.out.print("Number3 ");
        numbers.number3= scanner.nextInt();

        numbers.maximum(numbers.number1, numbers.number2, numbers.number3);
        numbers.minimum(numbers.number1, numbers.number2, numbers.number3);

    }
}
