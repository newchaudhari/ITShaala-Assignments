package __exceptionHandling;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("**************************************************");
        try {
            System.out.println(10/02);
            int[] array={12};
            System.out.println(array[0]);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Number cannot be divide by zero");

        }
        finally {
            System.out.println("finally block printed");
        }
        System.out.println("**************************************************");

    }
}
