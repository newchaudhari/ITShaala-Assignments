package __multithreading;

import java.time.LocalDateTime;

public class SumOfNumbers2 {
    static long sum = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->{
            for (int i = 1; i <= Integer.MAX_VALUE/2; i++) {
                sum+=i;
            }
        });
        Thread thread2=new Thread(()->{
            for (int i = Integer.MAX_VALUE/2+1; i <Integer.MAX_VALUE ; i++) {
                sum+=i;
            }
        });
        thread1.start();
        thread1.join(); 
        thread2.start();
        thread2.join();
        System.out.println("Sum2: "+sum);
    }
}
