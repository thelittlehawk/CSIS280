package ba.edu.ssst.week12;

public class Worker implements IGroupMemeber {

    private String name;

    private int id;

    public Worker(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int MemberId() {
        return id;
    }
}
