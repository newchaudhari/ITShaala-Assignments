package __exceptionHandling;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(10/10);
        throw new ArithmeticException("can't divide by zero");
    }
}
