package __exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
       m1();
    }

    public static void m1() {
        m2();
    }
    public static void m2() {
        try {
            m3();
        }catch (ArithmeticException arithmeticException){
            System.out.println("denominator cannot be zero");
        }
    }
    public static void m3() {
        m4();
    }
    public static void m4() {
        m5();
    }
    public static void m5() throws ArithmeticException {
        System.out.println(10/0);
    }
}
