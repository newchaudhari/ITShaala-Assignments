package __multithreading;

public class Demo4 {
    public static void main(String[] args) {
   Thread thread=new Thread(new Runnable() {
       @Override
       public void run() {
           System.out.println("Running multiple threading by anonymous class in different way");
       }
   });
   thread.start();

    }
}
