package _8_method;

import java.util.Scanner;

public class Assignment6 {
    //Write a program to print the circumference
    // and area of a circle of radius entered by user by defining your own method.
    double radius;
    double circumference(double radius){
        this.radius=radius;
        return 2*3.14*radius;
    }
    double area(double radius){
        this.radius=radius;
        return 3.14*(radius*radius);
    }

    public static void main(String[] args) {
        Assignment6 demo=new Assignment6();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius ");
        demo.radius= scanner.nextInt();

        System.out.println("Circumference of a circle is: "+demo.circumference(demo.radius));
        System.out.println("Area of a circle is: "+demo.area(demo.radius));
    }
}
