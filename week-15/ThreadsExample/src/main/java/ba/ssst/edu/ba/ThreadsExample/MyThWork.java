package ba.ssst.edu.ba.ThreadsExample;

public class MyThWork implements Runnable {

    String text;

    public MyThWork(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        JoinE.all = JoinE.all + this.text;
//        System.out.println();
    }

}
