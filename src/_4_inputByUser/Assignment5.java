package _4_inputByUser;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        //Take side of a square from user and print area and perimeter of it.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter of a Square");
        int side= scanner.nextInt();

        int area = side*side;
        int perimeter = 4*side;

        System.out.println("Area of a Square "+area);
        System.out.println("Perimeter of a Square "+perimeter);
    }
}
