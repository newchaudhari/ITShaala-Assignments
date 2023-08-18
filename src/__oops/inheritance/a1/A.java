package __oops.inheritance.a1;

public class A {
    int b=50;
    static {
        System.out.println("static block of class A");
    }
    {
        System.out.println("instance block of class A");
    }
    A(){

    }
    void m1(){
        System.out.println("instance method of class A");
    }
    static void m2(){
        System.out.println("static method of class A");
    }
}
