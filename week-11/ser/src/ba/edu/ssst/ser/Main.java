package ba.edu.ssst.ser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    try {
            ObjectOutputStream outStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("out.ser")));

            for (int i = 0 ; i < 10 ; i++) {
                Student s = new Student("First" + i, "Last" + i, new Random().nextInt(10000));
                outStream.writeObject(s);
            }

            ObjectInputStream inStream = new ObjectInputStream(Files.newInputStream(Paths.get("out.ser")));

//            while(true) {
//                Student inS = (Student) inStream.readObject();
//                System.out.println(inS.getFirst() + " " + inS.getLast());
//            }

//            DEFAULT
//            ObjectMapper om = new ObjectMapper();
//            String json = om.writeValueAsString(new Student("Test", "test", 123));
//
//            System.out.println(json);

            Student s = new Student("Test", "test", 123);
            ObjectMapper objectMapper = new ObjectMapper();

            SimpleModule simpleModule = new SimpleModule();
            simpleModule.addSerializer(Student.class, new StudentSerializer());
            simpleModule.addSerializer(Index.class, new IndexSerializer());
            objectMapper.registerModule(simpleModule);

            String serialized = objectMapper.writeValueAsString(s);
            System.out.println(serialized);
        } catch (EOFException e) {
	        System.out.println("End of file");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
