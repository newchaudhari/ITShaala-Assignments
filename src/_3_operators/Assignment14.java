package _3_operators;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        //Take a 4 digit number.
        //
        // Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
        //
        //For example, if the number which was taken is 5696, then the displayed number should be 7818.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter four digit number");
        int number=scanner.nextInt();

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

        firstDigit +=2;
        secondDigit +=2;
        thirdDigit +=2;
        fourthDigit +=2;

        int finalOutput=firstDigit%10*1000 + secondDigit%10*100 + thirdDigit%10*10 + fourthDigit%10 ;
        System.out.println("Adding two in every digit "+finalOutput);


    }
}
