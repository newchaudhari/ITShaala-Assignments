package _3_operators;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        //Write a program to calculate the sum of the first and the second last digit of a 5 digit number.
        //
        //E.g.- NUMBER : 12345 OUTPUT : 1+4=5
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter five digit number");
        int number=scanner.nextInt();

        int fifthDigit=number%10; // 5
        System.out.println("fifth digit "+fifthDigit);

        number /=10; //1234
        int fourthDigit=number%10; // 4
        System.out.println("fourth digit "+fourthDigit);

        number /=10; //123
        int thirdDigit=number%10; // 3
        System.out.println("third digit "+thirdDigit);

        number /=10; //12
        int secondDigit=number%10; // 4
        System.out.println("second digit "+secondDigit);

        number /=10; //1
        int firstDigit=number%10; // 4
        System.out.println("first digit "+firstDigit);

        int sum = firstDigit+fourthDigit;
        System.out.println("Sum of first and second last digit "+sum);


    }
}
