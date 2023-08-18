package __oops.interface_demo;

public interface A {
    static  int age = 22;

    static void m1(){
        System.out.println("static m1 method");
    }

    void m2();

     class NestedClass{
         int a=15;
         int b=16;
         int c=a+b;
     }

}
