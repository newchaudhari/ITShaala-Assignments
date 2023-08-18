package __array;

public class TransposeRectangularMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {
                    1,2,3,4
                },
                {
                    5,6,7,8
                }
        };
        int[][] transpose=new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transpose[column][row]=matrix[row][column];
            }
        }
        System.out.println("Printing transpose matrix");
        for (int[] temp:transpose) {
            for (int i:temp) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
