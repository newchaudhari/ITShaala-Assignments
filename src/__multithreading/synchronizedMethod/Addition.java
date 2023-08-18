package __multithreading.synchronizedMethod;

public class Addition {
    long sum=0;
   synchronized public void add(int start, int end){
        for (int i = start; i <=end ; i++) {
            sum+=i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Addition addition=new Addition();
        Thread thread=new Thread(()-> addition.add(1,50000));
        Thread thread1=new Thread(()-> addition.add(10001,100000));
        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println("Sum is "+addition.sum);
    }
}
