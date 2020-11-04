package com.thoughtworks.capability.gtb.Serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Date;

public class DateTimeSerializer extends StdSerializer<Date> {
    public DateTimeSerializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeNumber(date.getTime());
    }
}
