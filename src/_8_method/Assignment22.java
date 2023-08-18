package _8_method;

import java.util.Scanner;

public class Assignment22 {
    //A class has an integer data member 'i' and a method named 'printNum' to print the value of 'i'.
    // Its subclass also has an integer data member 'j' and a method named 'printNum' to print the value of 'j'.
    // Make an object of the subclass
    // and use it to assign a value to 'i' and to 'j'. Now call the method 'printNum' by this object.
    int i;
    void printNum(int i){
        this.i=i;
        System.out.println("i value "+i);
    }
    class Integer{
        int j;
        void printNum(int j){
            this.j=j;
            System.out.println("j value "+j);
        }
    }

    public static void main(String[] args) {
        Assignment22 demo=new Assignment22();
       Integer demo1=demo.new Integer();
       demo.printNum(89);
       demo1.printNum(56);

    }
}
