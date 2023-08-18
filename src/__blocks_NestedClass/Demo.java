package __blocks_NestedClass;

public class Demo {
    int a;
    int b;
    String str;

    public Demo() {
    }

    public Demo(int a, int b, String str) {
        this.a = a;
        this.b = b;
        this.str = str;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        Demo demo=new Demo(2,5,"Navin");
        demo.setStr("Anil");
        System.out.println(demo.getStr());
        Demo demo1=new Demo(3,6,"Dnyandeo");
        System.out.println(demo1.str);
        Demo demo2=new Demo(4,7,"Chaudhari");
        System.out.println(demo2.str);

    }
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }


}
