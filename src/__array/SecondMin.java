package __array;

public class SecondMin {
    public static void main(String[] args) {
        int[] array={15,98,56,43,29,83,49};
        int minimum=Integer.MAX_VALUE;
        int secondMinimum=Integer.MAX_VALUE;

        for (int index = 0; index < array.length; index++) {
            if (array[index]<minimum){
                secondMinimum=minimum;
                minimum=array[index];
            }
            if (array[index]<secondMinimum &&array[index] > minimum){
                secondMinimum=array[index];
            }
        }
        System.out.println("Minimum "+minimum);
        System.out.println("Second Minimum "+secondMinimum);


    }
}
