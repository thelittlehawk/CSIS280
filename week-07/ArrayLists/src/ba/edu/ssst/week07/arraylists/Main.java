package ba.edu.ssst.week07.arraylists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers2 = new ArrayList();
        for (int counter = 0 ; counter < 5 ; counter++) {
            numbers2.add(0, counter);
        }
        // 4, 3, 2, 1, 0

        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        // 10, 11, 12, 13, 14

        numbers.add(0, 16); // 16, 10, 11, 12, 13, 14

        numbers.add(3, 20); // 16, 10, 11, 20, 12, 13, 14

        // Contains

        numbers.contains(10);

        int indexOfElement = numbers.indexOf(20);

        numbers.set(indexOfElement, 20 * 20);
        // 16, 10, 11, 400, 12, 13, 14
    }
}
