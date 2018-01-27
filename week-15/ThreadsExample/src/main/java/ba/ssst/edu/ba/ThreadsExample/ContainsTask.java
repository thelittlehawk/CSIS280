package ba.ssst.edu.ba.ThreadsExample;

import java.util.List;

public class ContainsTask implements Runnable {

    int numberToFind;

    List<Integer> numbers;

    public ContainsTask(List<Integer> numbers, int numberToFind) {
        this.numbers = numbers;
        this.numberToFind = numberToFind;
    }

    @Override
    public void run() {
        SyncObject.update(numbers.contains(numberToFind));
    }
}
