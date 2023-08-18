package __oops.abstract_class;

public abstract class Demo2 extends Demo1 {
    abstract int m2(int number);

    @Override
    void m2() {
        System.out.println("override method in subclass m2");
    }
}
