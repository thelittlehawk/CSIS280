package ba.ssst.edu.week15.thread;

public class Sync {

    public static boolean contains = false;

    public static void updateContains(Boolean c) {
        contains = c;
    }
}
