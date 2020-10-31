package processor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static int[][] readMatrixFromStandartInput(){
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

    public static int[][] matrixMultiplication() throws ArithmeticException {

        int[][] firstMatrix = readMatrixFromStandartInput();
        int[][] secondMatrix = readMatrixFromStandartInput();

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

    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(matrixMultiplication()));
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
    }
}
