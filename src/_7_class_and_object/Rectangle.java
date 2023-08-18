package _7_class_and_object;

public class Rectangle {
    //Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
    // by creating a class named 'Rectangle' with a method named 'Area'
    // which returns the area and length and breadth passed as parameters to its constructor.
    int length,breadth;
    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }
    int getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,5);
        System.out.println("Area of rectangle1 "+r1.getArea());
        Rectangle r2=new Rectangle(5,8);
        System.out.println("Area of rectangle2 "+r2.getArea());
    }
}
