package __multithreading.synchronizedMethod;

public class DemoImpl {
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        Thread thread=new Thread(()->{
            for (int i = 1; i <=10 ; i++) {
                demo1.message();
                System.out.println(Thread.currentThread().getName());
            }
        },"Thread1");

        Thread thread1=new Thread(()->{
            for (int i = 1; i <=5 ; i++) {
                demo1.message();
                System.out.println(Thread.currentThread().getName());
            }
        },"Thread2");
        thread.start();
        thread1.start();
    }
}
