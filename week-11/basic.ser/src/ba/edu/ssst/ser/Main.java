package ba.edu.ssst.ser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectOutputStream outStream = new ObjectOutputStream(
                    Files.newOutputStream(
                            Paths.get("out.ser")
                    )
            );

            for (int i = 0 ; i < 100 ; i++) {
                Student student = new Student("First Name " + i, "Last Name " + i, 12345);
                outStream.writeObject(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream inStream = new ObjectInputStream(
                    Files.newInputStream(
                            Paths.get("out.ser")
                    )
            );

            while (true) {
                Student student = (Student) inStream.readObject();
                System.out.println(student.getFirstName() + " " + student.getIndex().getIndexNumber());
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("== DONE ==");
    }
}
