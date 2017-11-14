package ba.edu.ssst.week06.ArrayListExample;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Array operations
	    int[] numbers = { 29, 39, 19, 2, 3, 7, 8 };
	    int[] emptyArray = new int[10];

        Arrays.fill(emptyArray, -1);
	    Arrays.sort(numbers);

	    // Array List
        ArrayList<Integer> numbersAL = new ArrayList<Integer>();
        numbersAL.add(10);
        numbersAL.add(100);
        numbersAL.add(0, 1000);
        numbersAL.add(0, 1;

        System.out.println("Numbers : ");
        for (Integer a: numbersAL) {
            System.out.println(a);
        }

        // Check if exists
        numbersAL.contains(10);

        // Check if exists collection
        ArrayList<Integer> numbersAL2 = new ArrayList<Integer>();
        numbersAL2.add(10);
        numbersAL.containsAll(numbersAL2);

        numbersAL.get(0);

        // Get size
        numbersAL.size(); // same as length in 1D array

        int numberIndex = numbersAL.indexOf(100);

        numbersAL.clear();
    }
}
