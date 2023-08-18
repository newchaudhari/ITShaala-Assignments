package __array;

import java.util.Scanner;

public class MatrixByUser {
    public static void main(String[] args) {
        System.out.println("Enter no. of rows and column");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix=new int [rows][columns];

        System.out.println("Enter element");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column]= scanner.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }

    }
}
