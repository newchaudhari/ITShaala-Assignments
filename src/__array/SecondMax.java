package __array;

public class SecondMax {
    public static void main(String[] args) {
        int[] array={15,98,56,43,29,83,49};
        int maximum=Integer.MIN_VALUE;
        int secondMaximum=Integer.MIN_VALUE;

        for (int index = 0; index < array.length; index++) {
            if (array[index]>maximum){
                secondMaximum=maximum;
                maximum=array[index];
            }
            if (array[index]>secondMaximum &&array[index] < maximum){
                secondMaximum=array[index];
            }
        }
        System.out.println("Maximum "+maximum);
        System.out.println("Second Maximum "+secondMaximum);


    }
}
