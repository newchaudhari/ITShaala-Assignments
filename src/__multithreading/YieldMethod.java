package __multithreading;

public class YieldMethod {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            for (int i = 1; i <=5 ; i++) {
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        },"custom thread");
        thread.setPriority(10);

        Thread thread1=new Thread(()->{
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        },"most priority thread");
        thread1.setPriority(10);
        thread.start();
        thread1.start();
    }
}
