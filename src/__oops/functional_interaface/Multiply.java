package __oops.functional_interaface;

public class Multiply {
    public static void main(String[] args) {
        Multiplier<Integer> integerMultiplier = (i1, i2) -> i1 * i2;
        System.out.println("Multiply Integer " + integerMultiplier.multiply(42, 10));

        Multiplier<Double> doubleMultiplier = (d1, d2) -> d1 * d2;
        System.out.println("Multiply Double " + doubleMultiplier.multiply(12.5d, 4d));

        Multiplier<Long> longMultiplier = (l1, l2) -> l1 * l2;
        System.out.println("Multiply Long " + longMultiplier.multiply(50L, 4L));

        Multiplier<Float> floatMultiplier = (f1, f2) -> f1 * f2;
        System.out.println("Multiply Float " + floatMultiplier.multiply(10.0f, 15.5f));
    }
}
