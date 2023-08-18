package __oops.p1;

public class B {
    final private int id;
    final private String name;
    static int count;


    public B(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public B(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        B a1 = new B(1, "a");
        B a2 = new B(2, "b");
        B a3 = new B(3, "c");
        B a4 = new B(4, "d");
        B a5 = new B(5, "e");
        System.out.println(B.count);
    }
}
