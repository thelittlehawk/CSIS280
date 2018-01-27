package ba.edu.ssst.Student;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class InventorySerializer extends StdSerializer<Inventory> {
    protected InventorySerializer() {
        this(null);
    }
    protected InventorySerializer(Class<Inventory> t) {
        super(t);
    }

    @Override
    public void serialize(Inventory inventory, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartArray();

        for (int i = 0 ; i < inventory.Size() ; i++) {
            jsonGenerator.writeString(inventory.GetItem(i).toString());
        }

        jsonGenerator.writeEndArray();
    }
}
