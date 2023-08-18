package __exceptionHandling;

import java.util.Scanner;

public class Demo2 {
    public static int division(){
        System.out.println("Enter numbers");
        Scanner scanner = new Scanner(System.in);
        int division=0;
        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            division = number1 / number2;
            System.out.println("Quotient " + division);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Divisor cannot be zero, enter again");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            division = number1 / number2;
            System.out.println("Quotient " + division);


        }
        return division;
    }

    public static void main(String[] args) {
        division();



    }
}
