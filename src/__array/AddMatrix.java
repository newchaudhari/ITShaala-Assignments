package __array;

public class AddMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {
                        11, 12, 15
                },
                {
                        13, 14, 16
                }
        };
        int[][] matrix2 = {
                {
                        15, 16, 14
                },
                {
                        17, 18, 13
                }
        };

        System.out.println("Printing matrix 1");
        printMatrix(matrix1);

        System.out.println("Printing matrix 2");
        printMatrix(matrix2);

        addMatrix(matrix1, matrix2);


    }

    public static void printMatrix(int[][] matrix) {
        for (int[] temp : matrix) {
            for (int i : temp) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] addMatrix(int[][] matrix, int[][] matrix1) {

        int[][] sum = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum[row][column] = matrix[row][column] + matrix1[row][column];
            }
        }
        System.out.println("Printing sum of matrix ");
        printMatrix(sum);
        return sum;
    }
}
