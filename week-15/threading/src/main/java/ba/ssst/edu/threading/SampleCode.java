package ba.ssst.edu.threading;

import java.util.Random;

public class SampleCode implements Runnable {

    String name;

    Integer length;

    public SampleCode(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public void run() {
        try {
            for(int i = 0 ; i < length ; i++) {
                Thread.sleep(new Random().nextInt(10));
                System.out.println(name + " == " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
