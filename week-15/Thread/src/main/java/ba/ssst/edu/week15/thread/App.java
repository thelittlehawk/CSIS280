package ba.ssst.edu.week15.thread;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        // Generate a list
        Thread t1 = new Thread(new SampleThread("Test 1", 10));
        Thread t2 = new Thread(new SampleThread("Test 2", 10));
        Thread t3 = new Thread(new SampleThread("Test 3", 10));
        Thread t4 = new Thread(new SampleThread("Test 4", 10));
        t1.setPriority(10);
        t2.setPriority(10);
        t3.setPriority(10);
        t4.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
