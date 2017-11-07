package ba.edu.ssst.week06.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static void printMatrix(int[][] matrix) {
        for (int row = 0 ; row < matrix.length ; row++) {
            // matrixA[row]
            for (int col = 0 ; col < matrix[row].length ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Matrix add and subtraction
    public static void main(String[] args) {
	    // write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix A dimenstions:");
        int numberOfRowsA = scanner.nextInt();
        int numberOfColumnsA = scanner.nextInt();

        int[][] matrixA = new int[numberOfRowsA][numberOfColumnsA];

        System.out.println("Matrix B dimenstions:");
        int numberOfRowsB = scanner.nextInt();
        int numberOfColumnsB = scanner.nextInt();

        int[][] matrixB = new int[numberOfRowsB][numberOfColumnsB];

        // Random numbers
        for (int row = 0 ; row < matrixA.length ; row++) {
            for (int col = 0 ; col < matrixA[row].length ; col++) {
                Random random = new Random();
                matrixA[row][col] = random.nextInt(5) + 5;
            }
        }

        // Random numbers
        for (int row = 0 ; row < matrixB.length ; row++) {
            for (int col = 0 ; col < matrixB[row].length ; col++) {
                Random random = new Random();
                matrixB[row][col] = random.nextInt(5) + 5;
            }
        }

        System.out.println("Matrix A");
        printMatrix(matrixA);

        System.out.println("Matrix B");
        printMatrix(matrixB);

        // Add
        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
            int[][] matrixSum = new int[matrixB.length][matrixA[0].length];

            for(int row = 0 ; row < matrixA.length ; row++) {
                for(int col = 0 ; col < matrixB[row].length ; col++) {
                    matrixSum[row][col] = matrixA[row][col] + matrixB[row][col];
                }
            }

            System.out.println("Sum A + B");
            printMatrix(matrixSum);
        } else {
            System.out.println("I daon't want to...");
        }
    }
}
