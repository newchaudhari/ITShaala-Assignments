package __array;

public class MergedArray {
    public static void main(String[] args) {
        int[] array1={23,95,100,37,76};
        int[] array2={64,98,10,49,385};
        int[] mergedArray=new int[array1.length+array2.length];
        int indexOfMergedArray=0;

        for (int index = 0; index <array1.length && indexOfMergedArray<mergedArray.length; index++,indexOfMergedArray++) {
            mergedArray[indexOfMergedArray]=array1[index];

        }
        for (int index = 0; index <array2.length && indexOfMergedArray<mergedArray.length; index++,indexOfMergedArray++) {
            mergedArray[indexOfMergedArray]=array2[index];
        }

        for (int index = 0; index < mergedArray.length; index++) {
            System.out.print(mergedArray[index]+" ");
        }
    }
}
