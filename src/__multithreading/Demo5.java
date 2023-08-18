package __multithreading;

public class Demo5 {
    public static void main(String[] args) {
        Runnable runnable= ()-> System.out.println("multithreading by lambda method");;
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
