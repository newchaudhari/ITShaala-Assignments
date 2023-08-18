package _7_class_and_object;

import java.util.Scanner;

public class Area {
    //1. Write a program to print the area of a rectangle by creating a class named 'Area'
    //taking the values of its length and breadth as parameters of its constructor
    // and having a method named 'returnArea' which returns the area of the rectangle.
    //2. Length and breadth of rectangle are entered through keyboard.
    int length,breadth;
    Area(int l, int b){
        length=l;
        breadth=b;
    }
    int returnArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Length ");
        int length= scanner.nextInt();
        System.out.print("Enter breadth ");
        int breadth= scanner.nextInt();

        Area a1 = new Area(length,breadth);
        System.out.println("Area of rectangle " + a1.returnArea());

    }
}
