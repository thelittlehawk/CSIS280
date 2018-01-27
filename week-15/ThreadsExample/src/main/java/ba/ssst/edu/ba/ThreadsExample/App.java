package ba.ssst.edu.ba.ThreadsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        int TOTAL_NUMBER = 1000000;

        List<Integer> numbers = new ArrayList<>();

        System.out.println("BEGIN OF REGULAR");

        long startTime = System.currentTimeMillis();

        Random r = new Random();
        for (int i = 0 ; i < TOTAL_NUMBER ; i++) {
            numbers.add(r.nextInt());
        }

        int numberToFind = r.nextInt();

        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        System.out.println("Run time: " + runTime);


        System.out.println("Contains " + numberToFind + " " + numbers.contains(numberToFind));
        System.out.println("END OF REGULAR");


        System.out.println("BEGIN OF THREAD");

        int NUMBER_OF_THREADS = 10;
        int splitSize = numbers.size() / NUMBER_OF_THREADS;
        List<Thread> threads = new ArrayList<>();

        startTime = System.currentTimeMillis();

        for (int i = 0 ; i < NUMBER_OF_THREADS ; i++) {
            int beginIndex = i * splitSize;
            int endIndex = i * splitSize + splitSize;
            List<Integer> subNumbers = numbers.subList(beginIndex, endIndex);

            ContainsTask containsTask = new ContainsTask(subNumbers, numberToFind);
            Thread thread = new Thread(containsTask);
            threads.add(thread);
        }

        for (int i = 0 ; i < NUMBER_OF_THREADS ; i++) {
            threads.get(i).start();
        }

        for (int i = 0 ; i < NUMBER_OF_THREADS ; i++) {
            threads.get(i).join();
        }

        stopTime = System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("Run time: " + runTime);
        System.out.println("Contains " + numberToFind + " " + SyncObject.contains);

        System.out.println("END OF THREAD");
    }
}
