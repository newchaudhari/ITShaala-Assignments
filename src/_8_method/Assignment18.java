package _8_method;

import java.util.Scanner;

public class Assignment18 {
    //Create a class to print the area of a square and a rectangle.
    //
    //The class has two methods with the same name but different number of parameters.
    //
    //The method for printing area of rectangle has two parameters which are length and breadth respectively
    // while the other method for printing area of square has one parameter which is side of square.

    int length;
    int breadth;
    int side;
    int area(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
        return length*breadth;
    }
    int area(int side){
        this.side=side;
        return side*side;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Assignment18 a=new Assignment18();
        System.out.print("Length ");
        a.length= scanner.nextInt();
        System.out.print("Breadth ");
        a.breadth= scanner.nextInt();
        System.out.print("Side ");
        a.side= scanner.nextInt();
        System.out.println("Area of rectangle "+a.area(a.length,a.breadth));
        System.out.println("Area of Square "+a.area(a.side));
    }
}
