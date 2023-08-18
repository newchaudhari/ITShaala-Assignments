package __multithreading;

public class EvenOddNumber {
    public static void main(String[] args) throws InterruptedException {
        Thread even=new Thread(()->{
            for (int number = 1; number <=100 ; number++) {
                if (number%2==0){
                    System.out.println(number+" "+Thread.currentThread().getName());
                }
            }
        },"even");
        Thread odd=new Thread(()->{
            for (int number = 1; number <=100 ; number++) {
                if (number%2!=0){
                    System.out.println(number+" "+Thread.currentThread().getName());
                }

            }
        },"odd");

        even.start();
        even.join();
        odd.start();
    }
}
