package processor;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static int[][] readMatrixFromStandardInput(){
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; ++i) {
            for (int j  = 0; j < M ; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix) throws ArithmeticException {

        if (firstMatrix.length == secondMatrix.length &&
                firstMatrix[0].length == secondMatrix[0].length) {

            int N = firstMatrix.length;
            int M = firstMatrix[0].length;
            int[][] result = new int[N][M];

            for (int i = 0; i < N; ++i) {
                for (int j  = 0; j < M; ++j) {
                    result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }

            return result;

        } else {
            throw new ArithmeticException("ERROR");
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {

            for (int j = 0; j < matrix[0].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        /* int[][] firstMatrix = readMatrixFromStandardInput();
        int[][] secondMatrix = readMatrixFromStandardInput();

        try {
            printMatrix(matrixMultiplication(firstMatrix, secondMatrix));
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }

         */


    }
}
