package __multithreading;

public class Demo2 {
    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.start();
        Demo1 demo1=new Demo1();
        Thread thread=new Thread(demo1);
        thread.start();
        Thread thread1=new Thread("My first thread using thread class");
//        String str=thread1.getName();
        System.out.println(thread1.getName());
        Runnable r1=new Demo1();
        Thread thread2=new Thread(r1,"My new thread using runnable interface");
        System.out.println(thread2.getName());
        thread2.start();

    }
}
