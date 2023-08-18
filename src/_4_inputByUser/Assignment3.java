package _4_inputByUser;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        //Ask user to give two double input for length and breadth of a rectangle
        // and print area type casted to int.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Area of Rectangle");
        System.out.println("Length");
        double length= scanner.nextDouble();

        System.out.println("Breadth");
        double breadth= scanner.nextDouble();

        double area=length*breadth;

        System.out.println("Area of rectangle "+(int)area);

    }
}
