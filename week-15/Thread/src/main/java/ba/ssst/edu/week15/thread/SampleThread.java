package ba.ssst.edu.week15.thread;

import java.util.Random;

public class SampleThread extends Thread {

    private int length;

    private String threadName;

    public SampleThread(String threadName, int length)
    {
        this.length = length;
        this.threadName = threadName;
    }

    public void run() {
        for(int i = 0; i < length ; i++) {
            System.out.println(this.threadName + " == " + i);
            try {
                Thread.sleep(new Random().nextInt(100) + 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}