package __multithreading;

public class JoinMethod2 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread2=new Thread(()->{
            for (int i = 1; i <=5 ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        },"Thread");
        Thread thread1=new Thread(()->{
            for (int i = 1; i <=5 ; i++) {
                try {thread2.join();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        },"Custom Thread");
        thread1.start();
        thread2.start();
        thread1.join(1000);
        thread2.join(2000);
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
