package __array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array=new int[5][9];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]+" ");

            }
            System.out.println();
        }
    }
}
