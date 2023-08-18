package __array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {15, 98, 56, 43, 29, 83, 49, 43};
        int key = 43;
        for (int integer : array) {
            if (integer == key) {
                System.out.println("Element Found at Index "+integer);

            }
        }

    }
}
