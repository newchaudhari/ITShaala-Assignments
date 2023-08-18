package __array;

import java.util.Scanner;

public class TransposeRectangularMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = acceptByUser();
        System.out.println("Printing matrix");
        printMatrix(matrix);

        rectangularMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] acceptByUser() {
        System.out.println("Enter no. of rows and columns");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix element");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] rectangularMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transpose[column][row] = matrix[row][column];
            }
        }
        System.out.println("Printing transpose matrix");
        for (int[] temp : transpose) {
            for (int i : temp) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        return transpose;
    }
}
