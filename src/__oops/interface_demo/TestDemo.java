package __oops.interface_demo;
public class TestDemo implements Demo,Demo2{
    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public int n1(int n) {
        System.out.println("number "+n);
        return n;
    }
}
