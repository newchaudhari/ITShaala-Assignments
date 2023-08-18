package __oops.inheritance.a1;

public class ABTest {
    public static void main(String[] args) {
        A a=new A();
        B b = new B();
        System.out.println(a.b);
      //  System.out.println(A.c);
        System.out.println(b.b);
        System.out.println(B.c);
        b.m1();
        a.m1();

    }
}
