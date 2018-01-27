package ba.edu.ssst.Student;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import static spark.Spark.*;

public class App
{
    public static void main( String[] args )
    {
        get("/:value", (request, response) -> {
            Inventory<Pet> inevnetory = new Inventory<>();
            inevnetory.Add(new Pet("A", "B", "red", 10));
            inevnetory.Add(new Pet("A", "B", "red", 10));
            inevnetory.Add(new Pet("A", "B", "red", 10));
            inevnetory.Add(new Pet("A", "B", "red", 10));
            inevnetory.Add(new Pet("A", "B", "red", 10));
            inevnetory.Add(new Pet("A", "B", "red", 10));

            User u

            getName

                    getLast

            ObjectMapper objectMapper = new ObjectMapper();

            SimpleModule simpleModule = new SimpleModule();
            simpleModule.addSerializer(Inventory.class, new InventorySerializer());

            response.type("application/json");

            return objectMapper.writeValueAsString(inevnetory);
        });
    }
}
