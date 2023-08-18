package __array;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] array = {15, 98, 56, 43, 29, 83, 49, 43};
        int key = 43;
        for (int index=0; index< array.length;index++) {
            if (array[index] == key) {
                System.out.println("Element Found at Index "+index);

            }
        }

    }
}
