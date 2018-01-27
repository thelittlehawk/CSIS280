package ba.edu.ssst.Student;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.util.ArrayList;

public class Inventory<T extends IInventoryItem> {

    private ArrayList<T> items;

    public Inventory() {

    }

    public Inventory(ArrayList<T> items) {
        this.items = items;
    }

    public void Add(T item) {
        this.items.add(item);
    }

    public T GetItem(int index) {
        return this.items.get(index);
    }

    public int Size() {
        return this.items.size();
    }

    public T MostExpensive() {
        return items.get(0);
    }

    public T LeastExpensive() {
        return items.get(0);
    }
}
