package __oops.functional_interaface;

public class MaxMinImpl {
    public static void main(String[] args) {
        MaxMin maxMin=Integer::min;
        System.out.println("Minimum "+maxMin.maxMin(56,78));

        MaxMin maxMin1=Integer::max;
        System.out.println("Maximum "+maxMin1.maxMin(98,15681));

    }
}
