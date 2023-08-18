package __oops.interface_demo;

public class TestAB {
    public static void main(String[] args) {
        A a= new B();
        a.m2();
        System.out.println(A.age);
        A.m1();
        A.NestedClass v=new A.NestedClass();
        System.out.println(v.c);
    }
}
