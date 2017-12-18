package ba.edu.ssst.ser;

import java.io.Serializable;

public class Student implements Serializable {

    String first;

    String last;

    Index index;

    public Student(String first, String last, int index) {
        this.first = first;
        this.last = last;
        this.index = new Index(index);
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }
}
