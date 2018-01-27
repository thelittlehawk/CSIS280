package ba.ssst.edu.ba.ThreadsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App
{
    public static void main( String[] args ) throws InterruptedException {

        System.out.println("==== START ====");

        MyThWork myThWork = new MyThWork("Work, work, work... (0)");
        Thread thread = new Thread(myThWork);
        thread.start();

        MyThWork myThWork1 = new MyThWork("Work, work, work... (1)");
        Thread thread1 = new Thread(myThWork1);
        thread1.start();

        MyThWork myThWork2 = new MyThWork("Work, work, work... (2)");
        Thread thread2 = new Thread(myThWork2);
        thread2.start();

        MyThWork myThWork3 = new MyThWork("Work, work, work... (3)");
        Thread thread3 = new Thread(myThWork3);
        thread3.start();


//        thread.join();
//        thread1.join();
//        thread2.join();
//        thread3.join();

        System.out.println(JoinE.all);

        System.out.println("==== END ====");

        System.out.println(JoinE.all);

//        int TOTAL_NUMBER = 1000000;
//
//        List<Integer> numbers = new ArrayList<>();
//
//        System.out.println("BEGIN OF REGULAR");
//
//        long startTime = System.currentTimeMillis();
//
//        Random r = new Random();
//        for (int i = 0 ; i < TOTAL_NUMBER ; i++) {
//            numbers.add(r.nextInt());
//        }
//
//        int numberToFind = r.nextInt();
//
//        long stopTime = System.currentTimeMillis();
//        long runTime = stopTime - startTime;
//        System.out.println("Run time: " + runTime);
//
//
//        System.out.println("Contains " + numberToFind + " " + numbers.contains(numberToFind));
//        System.out.println("END OF REGULAR");
//
//
//        System.out.println("BEGIN OF THREAD");
//
//        int NUMBER_OF_THREADS = 10;
//        int splitSize = numbers.size() / NUMBER_OF_THREADS;
//        List<Thread> threads = new ArrayList<>();
//
//        startTime = System.currentTimeMillis();
//
//        for (int i = 0 ; i < NUMBER_OF_THREADS ; i++) {
//            int beginIndex = i * splitSize;
//            int endIndex = i * splitSize + splitSize;
//            List<Integer> subNumbers = numbers.subList(beginIndex, endIndex);
//
//            ContainsTask containsTask = new ContainsTask(subNumbers, numberToFind);
//            Thread thread = new Thread(containsTask);
//            threads.add(thread);
//        }
//
//        for (int i = 0 ; i < NUMBER_OF_THREADS ; i++) {
//            threads.get(i).start();
//        }
//
//        for (int i = 0 ; i < NUMBER_OF_THREADS ; i++) {
//            threads.get(i).join();
//        }
//
//        stopTime = System.currentTimeMillis();
//        runTime = stopTime - startTime;
//        System.out.println("Run time: " + runTime);
//        System.out.println("Contains " + numberToFind + " " + SyncObject.contains);
//
//        System.out.println("END OF THREAD");
    }
}
