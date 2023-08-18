package _6_loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number=scanner.nextInt();
        System.out.println("Original Number: "+number);
        int reverse = 0;
        while (number>0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("Reverse number: "+reverse);
    }
}
