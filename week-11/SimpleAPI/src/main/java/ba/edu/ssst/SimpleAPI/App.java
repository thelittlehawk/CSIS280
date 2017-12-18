package ba.edu.ssst.SimpleAPI;

import com.fasterxml.jackson.databind.ObjectMapper;

import static spark.Spark.*;

public class App
{

    public static void main( String[] args )
    {
        ObjectMapper om = new ObjectMapper();



//        get("/hello", (req, res) -> {
//            res.type("application/json");
//            return "{'firstName': 'Someone'}";
//        });

        get("/hello/:name", (req, res) -> {
            res.type("application/json");
            return om.writeValueAsString(new Student("f", req.params(":name")));
        });
    }
}
