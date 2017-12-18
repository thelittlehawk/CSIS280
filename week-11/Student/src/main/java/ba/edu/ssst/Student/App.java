package ba.edu.ssst.Student;

import com.fasterxml.jackson.databind.ObjectMapper;

import static spark.Spark.*;

public class App
{
    public static void main( String[] args )
    {
        get("/:value", (request, response) -> {
            ObjectMapper objectMapper = new ObjectMapper();
            String val = request.params(":value");

            Student student = new Student("First name", val);

            response.type("application/json");

            return objectMapper.writeValueAsString(student);
        });
    }
}
