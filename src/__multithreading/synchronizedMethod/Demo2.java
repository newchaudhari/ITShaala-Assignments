package __multithreading.synchronizedMethod;

public class Demo2 {



    public static void main(String[] args) throws InterruptedException {
    long product=1;
        for (int i = 1; i <=15 ; i++) {
            product*=i;
        }
        System.out.println(product);
    }
}

