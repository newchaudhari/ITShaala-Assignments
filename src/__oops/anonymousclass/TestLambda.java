package __oops.anonymousclass;

import java.util.Objects;

public class TestLambda{
    public static void main(String[] args) {
        Calculate add = new Calculate() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        };
        System.out.println("Add " + add.calculate(68, 72));

        Calculate multiply = (number1, number2) -> number1 * number2;
        System.out.println("Multiply by lambda method " +multiply.calculate(12,3));
        

    }

}
