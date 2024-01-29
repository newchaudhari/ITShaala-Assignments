package _6_loop;

import java.util.Scanner;

public class PrimeNumbers2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }

        /*for (int i=1; i<=100; i++){
            boolean isPrime=true;
            for (int j = 2; j <=i/2 ; j++) {
                if (i%j==0){
                    isPrime=false;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }*/

    }

    public static boolean isPrimeNumber(int number) {

        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
