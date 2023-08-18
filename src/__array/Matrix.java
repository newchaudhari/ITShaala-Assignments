package __array;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrixArray={
                {
                    1,2,3
                },
                {
                    5,6,7,8,45,78,63
                },
                {
                    9,10,11,12,569,145
                }
        };
        System.out.println(Arrays.deepToString(matrixArray));

//        System.out.println(matrixArray[1][2]);

        for (int row = 0; row < matrixArray.length; row++) {
            for (int column = 0; column < matrixArray[row].length; column++) {
                System.out.print(matrixArray[row][column]+" ");
            }
            System.out.println();
        }
    }
}
