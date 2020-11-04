package com.thoughtworks.capability.gtb.Serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Date;

public class AgeSerializer extends StdSerializer<Integer> {
    public AgeSerializer() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer age, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if(age == null)
            gen.writeNumber(0);
    }
}

