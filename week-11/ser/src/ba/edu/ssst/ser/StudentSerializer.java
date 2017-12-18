package ba.edu.ssst.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class StudentSerializer extends StdSerializer<Student> {

    public StudentSerializer () {
        this(null);
    }
    public StudentSerializer (Class<Student> t) {
        super(t);
    }

    @Override
    public void serialize(
            Student value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
        jgen.writeStartObject();
        jgen.writeStringField("firstName", value.getFirst());
        jgen.writeStringField("lastName", value.getLast());
        jgen.writeObject(value.index);
        jgen.writeEndObject();
    }
}
