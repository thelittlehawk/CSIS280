package ba.ssst.edu.ba.ThreadsExample;

public class SyncObject {

    static Object obj = new Object();

    static boolean contains = false;

    public static void update(boolean newContains) {
        if (contains != true)
            synchronized (obj) {
                contains = newContains;
            }
    }

}
