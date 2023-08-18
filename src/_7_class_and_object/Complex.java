package _7_class_and_object;

import java.util.Scanner;

public class Complex {
    //Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
    // with separate methods for each operation whose real and imaginary parts are entered by user.
    int real;
    int img;
    Complex(){

    }
    Complex(int realTemp, int imgTemp){
        real=realTemp;
        img=imgTemp;
    }
    Complex addComp(Complex c1,Complex c2){
        Complex temp=new Complex();
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        return temp;
    }
    Complex subComp(Complex c1, Complex c2){
        Complex temp=new Complex();
        temp.real=c1.real-c2.real;
        temp.img=c1.img-c2.img;
        return temp;
    }
    Complex multiplyComp(Complex c1, Complex c2){
        Complex temp=new Complex();
        temp.real=c1.real* c2.real;
        temp.img=c1.img* c2.img;
        return temp;
    }
    void printRealAndImaginary(){
        System.out.println("Complex Number: "+real+" + "+ img+"i");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Real ");
        int real= scanner.nextInt();
        System.out.print("Imaginary ");
        int img= scanner.nextInt();
        Complex c1=new Complex(real,img);
        c1.printRealAndImaginary();

        System.out.print("Real ");
        int real1= scanner.nextInt();
        System.out.print("Imaginary ");
        int img1= scanner.nextInt();
        Complex c2=new Complex(real1,img1);
        c2.printRealAndImaginary();

        Complex c3=new Complex();

        c3=c3.addComp(c1,c2);
        System.out.print("Sum is ");
        c3.printRealAndImaginary();

        c3=c3.subComp(c1,c2);
        System.out.print("Subtraction is ");
        c3.printRealAndImaginary();

        c3=c3.multiplyComp(c1,c2);
        System.out.print("Multiplication is ");
        c3.printRealAndImaginary();

    }

}
