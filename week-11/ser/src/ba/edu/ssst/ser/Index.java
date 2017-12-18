package ba.edu.ssst.ser;

import java.io.Serializable;
import java.util.ArrayList;

public class Index implements Serializable {
    int index;

    ArrayList<Integer> numbers;

    public Index(int index) {
        this.index = index;
        this.numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
    }

    public int getIndex() {
        return index;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
