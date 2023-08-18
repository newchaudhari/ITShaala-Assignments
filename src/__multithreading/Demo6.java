package __multithreading;

public class Demo6 {
    public static void main(String[] args) {
        Thread thread=new Thread(()-> System.out.println("multithreading by lambda in different way"));
        thread.start();
    }
}
