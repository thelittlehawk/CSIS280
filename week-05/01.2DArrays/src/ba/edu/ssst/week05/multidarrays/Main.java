package ba.edu.ssst.week05.multidarrays;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num of Rows: ");
        int numOfRows = scanner.nextInt();

        System.out.print("Num of Cols: ");
        int numOfColumns = scanner.nextInt();

	    int[][] array2D = new int[numOfRows][numOfColumns];

	    for (int row = 0 ; row < numOfRows ; row++) {
	        for (int column = 0 ; column < numOfColumns ; column++) {
	            array2D[row][column] = 10;
            }
        }

        System.out.println("---------------------");

        System.out.println("Create new 2D array:");
	    System.out.println("Num of rows: ");
	    numOfRows = scanner.nextInt();

	    int[][] array2DAsy = new int[numOfRows][];
	    for (int inc = 0 ; inc < numOfRows ; inc++) {
            System.out.print("Number of elements in " + (inc + 1) + " row: ");
            numOfColumns = scanner.nextInt();
            array2DAsy[inc] = new int[numOfColumns];
        }

        System.out.println("---------------------");

	    int [][][] array3d = new int[5][1][10];
    }
}
