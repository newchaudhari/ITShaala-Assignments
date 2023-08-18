package _8_method;

public class Assignment7 {
    //Define a method to find out if number is prime or not.
    int number;
    void primeNumber(int number) {
        this.number=number;
        boolean isPrime=true;
        for (int i=2;i<=number/2;i++){
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(number);
        System.out.println(isPrime?"It's Prime":"Not Prime");
    }

    public static void main(String[] args) {
        Assignment7 assignment7=new Assignment7();
        assignment7.primeNumber(50);
    }
}
