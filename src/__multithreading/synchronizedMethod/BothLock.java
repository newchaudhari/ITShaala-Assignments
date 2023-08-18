package __multithreading.synchronizedMethod;

public class BothLock {
    long sum = 0;
    static long sum1 = 0;
    static long multiply=1;

    synchronized public static void addition1(int start, int end) {
        for (int i = start; i <= end; i++) {
            sum1 += i;
        }
    }

    synchronized public void addition2(int start, int end) {
        for (int i = start; i <= end; i++) {
            sum+=i;
        }
    }

    public static void multiplication(){
        for (int i = 1; i <=15 ; i++) {
            multiply*=i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //class level lock
        Thread thread1=new Thread(()->BothLock.addition1(1,25637));
        Thread thread2=new Thread(()->BothLock.addition1(25638,78613));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();


        //object level lock
        BothLock bothLock=new BothLock();
        Thread thread3=new Thread(()->bothLock.addition2(1,25637));
        Thread thread4=new Thread(()->bothLock.addition2(25638,78613));
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();

        //Normal Thread
        Thread thread5=new Thread(BothLock::multiplication);
        thread5.start();
        thread5.join();

        System.out.println("by using static method sum is "+sum1);
        System.out.println("by using instance method sum is "+bothLock.sum);
        System.out.println("by using static method multiplication is "+multiply);
    }
}
