package __oops.method_reference;

import __oops.interface_demo.DefaultImpl;
import __oops.interface_demo.DefaultMethod;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        //Taking Input From User
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number1: ");
        int n1= scanner.nextInt();
        System.out.print("Number2: ");
        int n2= scanner.nextInt();


        //Creating Object to take reference to call method
        Calculator calculator=new Calculator();


        //Method reference
        Demo add= Calculator::add;//using static method
        Demo multiply= calculator::multiply;
        Demo subtract= calculator::subtract;
        Demo divide= calculator::divide;
        Demo remainder= calculator::remainder;


        //printing the values
//        System.out.println("number1: "+n1+"\n"+"Number2: "+n2);
        System.out.println("Addition: "+add.calculate(n1,n2));
        System.out.println("Subtraction: "+subtract.calculate(n1,n2));
        System.out.println("Multiplication: "+multiply.calculate(n1,n2));
        System.out.println("Division: "+divide.calculate(n1,n2));
        System.out.println("Remainder: "+remainder.calculate(n1,n2));
    }
}
