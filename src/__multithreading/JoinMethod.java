package __multithreading;

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        },"custom thread");
        thread.start();
        thread.join(4000);
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
