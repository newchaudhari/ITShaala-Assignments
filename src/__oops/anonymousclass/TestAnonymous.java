package __oops.anonymousclass;

public class TestAnonymous {
    public static void main(String[] args) {
        Calculate add = new Calculate() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        };
        Calculate add1 = (number1, number2) -> number1 + number2;
        System.out.println(add1.calculate(40,30));

        Calculate subtract = new Calculate() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 - number2;
            }
        };
        Calculate divide = new Calculate() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 / number2;
            }
        };
        Calculate multiply = new Calculate() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 * number2;
            }
        };
        System.out.println("Addition "+add.calculate(70, 30));
        System.out.println("Subtraction "+subtract.calculate(70, 30));
        System.out.println("Multiplication "+multiply.calculate(70, 30));
        System.out.println("Division "+divide.calculate(70, 30));

    }
}
