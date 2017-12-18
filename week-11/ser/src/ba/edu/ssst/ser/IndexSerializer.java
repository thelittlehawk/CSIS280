package ba.edu.ssst.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.io.IOException;

public class IndexSerializer extends StdSerializer<Index> {

    public IndexSerializer () {
        this(null);
    }

    protected IndexSerializer(Class<Index> t) {
        super(t);
    }

    @Override
    public void serialize(Index index, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
//        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectFieldStart("index");
        jsonGenerator.writeNumberField("number", index.getIndex());
        jsonGenerator.writeArrayFieldStart("numbers");
        int[] numbers = index.getNumbers().stream().mapToInt(i -> i).toArray();
        jsonGenerator.writeArray(numbers, 0, numbers.length);
        jsonGenerator.writeEndArray();
        jsonGenerator.writeEndObject();
//        jsonGenerator.writeEndObject();
    }
}

