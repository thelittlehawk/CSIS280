package ba.edu.ssst.jsonser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();

        Student s = new Student("F", "L", 12345);

        try {
            String sJSON = om.writeValueAsString(s);
            System.out.println(sJSON);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
