package __oops.functional_interaface;

public class Sum {
    public static void main(String[] args) {

        Summer<Integer> addInteger= (a, b) -> a+b;
        System.out.println("Sum of Integer "+addInteger.sum(56,78));

        Summer<Double> addDouble= Double::sum;
        System.out.println("Sum of Double "+addDouble.sum(36.1,41.9));

        Summer<Long> addLong= Long::sum;
        System.out.println("Sum of Long "+addLong.sum(600L,700L));

        Summer<Float> addFloat= Float::sum;
        System.out.println("Sum of Float "+addFloat.sum(10.2f,20.3f));

    }
}
