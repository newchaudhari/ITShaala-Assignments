package __classAndObject_practice;

public class Demo1 {
    int a=20;
    int b=30;
    int c=40;
    static int d=50;

    public static void main(String[] args) {
        int a=60;
        int b=70;
        int c=80;
        int d=90;

        // to create local variable we did not need to create any class or object,
        // it is used to store temporary calculation

        System.out.println("local variable "+a);
        System.out.println("local variable "+b);
        System.out.println("local variable "+c);
        System.out.println("local variable "+d);
        System.out.println();

        //to call instance variable we need to create object i.e instance variable is an object specific

        Demo1 d1=new Demo1();
        System.out.println("instance variable "+d1.a);
        System.out.println("instance variable "+d1.b);
        System.out.println("instance variable "+d1.c);
        System.out.println();

        // to call static variable we did not need to create object i.e it is common to all
        // we can call it by writing class name. and variable name of static variable

        System.out.println("static variable "+Demo1.d);
    }
}
