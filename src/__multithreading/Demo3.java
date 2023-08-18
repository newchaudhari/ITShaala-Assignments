package __multithreading;

public class Demo3 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Running multiple threading by anonymous class");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
