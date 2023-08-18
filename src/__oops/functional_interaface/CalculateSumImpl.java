package __oops.functional_interaface;

import __oops.anonymousclass.Calculate;

import java.util.Scanner;

public class CalculateSumImpl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number1: ");
        int n1= scanner.nextInt();
        System.out.print("Number2: ");
        int n2= scanner.nextInt();
        CalculateSum add = (a,b)-> a+b;
        System.out.println("Sum: "+add.sum(n1,n2));
    }
}
