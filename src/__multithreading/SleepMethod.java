package __multithreading;

public class SleepMethod {
    public static void main(String[] args) {
    Thread thread1=new Thread(()->{
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.currentThread().setName("Thread");
            System.out.println(i+" "+Thread.currentThread().getName());

        }
    });

    Thread thread2=new Thread(()->{
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.currentThread().setName("main");
            System.out.println(i+" "+Thread.currentThread().getName());

        }
    });
    thread1.start();
    thread2.start();
    }
}
