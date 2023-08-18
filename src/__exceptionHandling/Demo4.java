package __exceptionHandling;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        System.out.println("Division: "+divide(number1,number2));
    }

    private static int divide(int number1, int number2) {
        int division=0;
        try {
            division=number1/number2;
        }catch (ArithmeticException arithmeticException){
            System.out.println("Denominator cannot be zero");
        }
        return division;
    }
}
