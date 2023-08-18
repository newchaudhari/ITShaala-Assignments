package __array;

import java.util.Scanner;


public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = acceptByUser();
        System.out.println("Printing user accepted matrix");
        printMatrix(matrix);
        int[][] transpose = transposeMatrix(matrix);
        System.out.println("Printing transpose matrix");
        printMatrix(transpose);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transposeMatrix[row][column] = matrix[column][row];
            }
        }
        return transposeMatrix;
    }


    public static int[][] acceptByUser() {
        System.out.println("Enter no. of rows and columns");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter elements of matrix");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

}
