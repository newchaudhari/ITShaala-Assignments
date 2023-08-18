package _7_class_and_object;


import java.util.Scanner;

public class AreaOfRectangle {
    //1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
    //2. First method named as 'setDim' takes length and breadth of rectangle as parameters
    // and the second method named as 'getArea' returns the area of the rectangle.
    //3. Length and breadth of rectangle are entered through keyboard.


    int l; //instance variable
    int b; //instance variable

    void setDim(int l, int b){
// method used to take input from user
    }
    int getArea(){
       return l*b; //method used to gives output of area of rectangle

    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        AreaOfRectangle a=new AreaOfRectangle(); //creating object to access instance variable and method

        System.out.println("Enter Length"); //taking input from user

        a.l= scanner.nextInt();
        System.out.println("Enter Breadth");//taking input from user

        a.b= scanner.nextInt();
        System.out.println("Area of rectangle "+a.getArea()); //output i.e area of rectangle

    }

}
