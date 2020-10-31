package processor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int firstMatrixSizeN = scanner.nextInt();
        int firstMatrixSizeM = scanner.nextInt();

        int[][] firstMatrix = new int[firstMatrixSizeN][firstMatrixSizeM];

        for (int i = 0; i < firstMatrixSizeN; ++i) {
            for (int j  = 0; j < firstMatrixSizeM ; ++j) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        int secondMatrixSizeN = scanner.nextInt();
        int secondMatrixSizeM = scanner.nextInt();

        int[][] secondMatrix = new int[secondMatrixSizeN][secondMatrixSizeM];

        for (int i = 0; i < secondMatrixSizeN; ++i) {
            for (int j  = 0; j < secondMatrixSizeM ; ++j) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        if (firstMatrixSizeN == secondMatrixSizeN &&
            firstMatrixSizeM == secondMatrixSizeM) {
            for (int i = 0; i < firstMatrixSizeN; ++i) {

                for (int j  = 0; j < firstMatrixSizeM; ++j) {
                    System.out.print(firstMatrix[i][j] + secondMatrix[i][j] + " ");
                }

                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }

        scanner.close();
    }
}
