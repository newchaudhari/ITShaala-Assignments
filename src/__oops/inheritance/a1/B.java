package __oops.inheritance.a1;

public class B extends A{
    int b=70;
    static int c=80;
    static {
        System.out.println("static block of class B");
    }
    {
        System.out.println("instance block of class B");
    }
    B(){

    }
    void m1(){
        System.out.println("instance method of class B");
    }
    static void m2(){
        System.out.println("static method of class B");
    }
}
