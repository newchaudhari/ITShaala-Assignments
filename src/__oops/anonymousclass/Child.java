package __oops.anonymousclass;

public class Child implements Calculate{
    @Override
    public int calculate(int number1, int number2) {
        return number1+number2;
    }

    public static void main(String[] args) {
        Calculate addition=new Child();
        System.out.println(addition.calculate(50,80));
    }
}
