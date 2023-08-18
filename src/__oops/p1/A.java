package __oops.p1;

public class A {
    public String a="public";
    private String b="private";
    protected String c="protected";
    String d="default";
    void  m1(){
        A a=new A();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }

    public static void main(String[] args) {
      A a1=new A();
      a1.m1();
    }
}
