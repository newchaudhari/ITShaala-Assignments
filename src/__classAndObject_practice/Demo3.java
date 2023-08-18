package __classAndObject_practice;


public class Demo3 {
    int rollNumber=13;
    String name="Navin Chaudhari";
    String address="Padalse";

    static String collageName="SSGBCOET Bhusawal";


    public static void main(String[] args) {
        int number=10;
        int number2=23;
        System.out.println("Local Variable");
        System.out.println(number);
        System.out.println(number2);
        System.out.println();

        Demo3 s1= new Demo3();
        Demo3 s2= new Demo3();
        System.out.println("Instance Variable");
        System.out.println(s1.rollNumber);
        System.out.println(s1.name);
        System.out.println(s1.address);
        System.out.println();


        System.out.println("Static Variable");
        System.out.println(Demo3.collageName);
        System.out.println();


        s1.rollNumber=15;
        s1.name="Anil Chaudhari";
        s1.address="Yawal";
        System.out.println(s1.rollNumber);
        System.out.println(s1.name);
        System.out.println(s1.address);
        System.out.println(Demo3.collageName);
        System.out.println();

        System.out.println("Object 2");
        s2.rollNumber=20;
        s2.name="Vinit Chaudhari";
        s2.address="Bhusawal";
        System.out.println(s2.rollNumber);
        System.out.println(s2.name);
        System.out.println(s2.address);
        System.out.println(Demo3.collageName);
    }
    }




