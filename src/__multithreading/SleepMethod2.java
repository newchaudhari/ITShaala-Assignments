package __multithreading;

public class SleepMethod2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                System.out.println(i+" "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"custom thread");
        thread.start();
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(5000);
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
