package __exceptionHandling;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        try {
            System.out.println("Division: "+divide(number1,number2));
        }catch (ArithmeticException arithmeticException){
            System.out.println("Denominator cannot be zero");
        }
    }

   public static int divide(int number1, int number2) {
        return number1/number2;

    }
}
