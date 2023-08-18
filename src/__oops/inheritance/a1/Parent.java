package __oops.inheritance.a1;

public class Parent {
    public int a=50;
    public void m1(){
        System.out.println("Parent Class");
    }
    static {
        System.out.println("static block");
    }
     {
        System.out.println("Instance block");
    }
}
