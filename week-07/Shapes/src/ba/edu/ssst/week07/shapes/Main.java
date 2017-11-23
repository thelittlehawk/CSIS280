package ba.edu.ssst.week07.shapes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList();
        shapes.add(new Circle("Circle 1"));
        shapes.add(new Rectangle("Rectangle", 4, 10));
        shapes.add(new Circle("Circle 2", 10));
        shapes.add(new Rectangle("New one...", 10, 5));
        shapes.add(new Square("Square 1234", 10));

        for (Shape shape: shapes) {

            IShape shapeInterface = shape;

            System.out.println(String.format("%s %.2f", shape.getName(), shape.area()));

            if (shape instanceof Square) {
                String result = ((Square) shape).somethingAbout();
                System.out.println(result);
            }

            shape.draw();
        }

    }
}
