package _7_class_and_object;

public class Triangle {
    //Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
    // by creating a class named 'Triangle' without any parameter in its constructor.

    int side1=3;
    int side2=4;
    int side3=5;

    int perimeter(){
        return side1+side2+side3;
    }
    double area(){
        return 0.5*perimeter();
    }

    public static void main(String[] args) {
        Triangle t1=new Triangle();
        System.out.println("Perimeter of the Triangle "+t1.perimeter());
        System.out.println("Area of the Triangle "+t1.area());
    }


}
