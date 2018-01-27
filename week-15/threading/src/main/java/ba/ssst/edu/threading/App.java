package ba.ssst.edu.threading;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        List<Thread> ths = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++) {
            SampleCode sampleThread = new SampleCode("SC " + i, 10);

            Thread thread = new Thread(sampleThread);
            ths.add(thread);
            thread.start();
        }
        System.out.println("Not sure");
        for(int i = 0 ; i < 10 ; i++) {
            ths.get(i).join();
        }
        System.out.println("Ok");
    }
}
