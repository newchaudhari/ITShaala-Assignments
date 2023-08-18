package __exceptionHandling;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        System.out.println("Enter you age");
        Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();
        if (age<18){
            throw new InvalidAgeException("under age");
        }else {
            System.out.println("eligible to vote");
        }
        System.out.println(23.5%0);
    }
}
