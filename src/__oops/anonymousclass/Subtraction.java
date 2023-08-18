package __oops.anonymousclass;

public class Subtraction implements Calculate {
    @Override
    public int calculate(int number1, int number2) {
        return number1-number2;
    }

    public static void main(String[] args) {
        Calculate subtraction = new Subtraction();
        System.out.println(subtraction.calculate(98,42));
    }
}
