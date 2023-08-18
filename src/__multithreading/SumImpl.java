package __multithreading;

public class SumImpl {
    public static void main(String[] args) throws InterruptedException {
        Sum sum=new Sum();
        Thread thread=new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                sum.counter++;
            }
        },"thread1");

        Thread thread1=new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                sum.counter++;
            }
        }, "thread2");
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(sum.counter);
    }
}
