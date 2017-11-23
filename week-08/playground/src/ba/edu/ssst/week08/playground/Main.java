package ba.edu.ssst.week08.playground;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<IShape> shapes = new ArrayList<>();
        shapes.add(new Shape("Test"));
        shapes.add(new Circle("Test"));

        shapes.get(0).area();
        shapes.get(1).area();
    }
}
