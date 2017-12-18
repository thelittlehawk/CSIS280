package ba.edu.ssst.ser;

import java.io.Serializable;

public class Index implements Serializable {

    int indexNumber;

    public Index (int indexNumber){
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }
}
