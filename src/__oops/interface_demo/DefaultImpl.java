package __oops.interface_demo;

import java.util.Scanner;

public class DefaultImpl implements DefaultMethod, DefaultMethod2 {
    @Override
    public void m1() {
        System.out.println("Default Method m1");
    }

    @Override
    public void m2() {
        System.out.println("Default Method m2");
    }

    @Override
    public void m3() {
        System.out.println("Same Default Method override in Child Class");
    }

    @Override
    public int m4(int n1, int n2) {
     DefaultMethod.super.m4(n1,n2);
     return DefaultMethod2.super.m4(n1,n2);
    }
    public int m5(int n1, int n2) {
        int remainder = n1 % n2;
        System.out.println("Remainder " + remainder);
        return remainder;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DefaultMethod m1 = new DefaultImpl();
        m1.m1();
        DefaultMethod2 m2 = new DefaultImpl();
        m2.m2();
        DefaultImpl m3 = new DefaultImpl();
        m3.m3();
        System.out.print("Number1: ");
        int n1 = scanner.nextInt();
        System.out.print("Number2: ");
        int n2 = scanner.nextInt();

        m3.m4(n1, n2);
//      m3.m5(n1, n2);

    }
}
