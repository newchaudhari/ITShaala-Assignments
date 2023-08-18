package _7_class_and_object;

import java.util.Scanner;

public class Triangle2 {
    //Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
    // by creating a class named 'Triangle' with constructor having the three sides as its parameters.

    int side1,side2,side3;
    Triangle2(int s1, int s2, int s3){
        side1=s1;
        side2=s2;
        side3=s3;
    }
    int getPerimeter(){
        return side1+side2+side3;
    }
    double getArea(){
        return 0.5*getPerimeter();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Side of Triangle");
        int side1= scanner.nextInt();
        int side2= scanner.nextInt();
        int side3= scanner.nextInt();

        Triangle2 t1=new Triangle2(side1,side2,side3);
        System.out.println("Perimeter of Triangle "+t1.getPerimeter());
        System.out.println("Area of Triangle "+t1.getArea());
    }
}
