package __constructor_practice;

public class Demo1 {
    Demo1(){
        System.out.println("Zero param Con");
        System.out.println("TP");
    }

    public static void main(String[] args) {
        Demo1 d=new Demo1();
        System.out.println(d);
    }
}
