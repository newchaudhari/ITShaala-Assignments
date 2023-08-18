package _8_method;

public class Assignment13_1 {
    void numberInRange() {

        for (int number = 1; number <= 10000; number++) {
            //check each number is perfect or not
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if (sumOfFactors == number) {
                System.out.println("Its perfect " + number);
            }
        }
    }

    public static void main(String[] args) {
        Assignment13_1 a=new Assignment13_1();
        a.numberInRange();
    }
}
