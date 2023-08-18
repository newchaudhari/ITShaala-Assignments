package __multithreading.synchronizedMethod;

public class ClassLevelLock {
    static long add= 0;
    synchronized public static void addition(int start, int end){
        for (int i =start; i <=end ; i++) {
            add+=i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->ClassLevelLock.addition(1,5000));
        Thread thread2=new Thread(()->ClassLevelLock.addition(5001,19423));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Sum is "+add);
    }
}
