package _8_method;

public class A {
    //Suppose a class 'A' has a static method to print "Parent".
    // Its subclass 'B' also has a static method with the same name to print "Child".
    // Now call this method by the objects of the two classes.
    // Also, call this method by an object of the parent class refering to the child class i.e. A obj = new B()
    static void m1(){
        System.out.println("Parent");

    }
    class B{
        static void m1(){
            System.out.println("Child");
        }
    }


    public static void main(String[] args) {
        A demo1=new A();
        A.B demo=demo1.new B();
       demo1.m1();
       demo.m1();
    }
}
