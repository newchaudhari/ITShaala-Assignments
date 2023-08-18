package __oops.abstract_class;

public class TestDemo extends Demo2{

    @Override
    int m2(int number) {
        System.out.println("override method "+number);
        return number;
    }

    public static void main(String[] args) {
        Demo1 demo1=new TestDemo();
        demo1.m1();
        demo1.m2();

        Demo2 demo2=new TestDemo();
        demo2.m2(56);



    }
}
