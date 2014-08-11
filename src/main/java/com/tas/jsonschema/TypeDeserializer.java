package com.tas.jsonschema;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class TypeDeserializer extends JsonDeserializer<Type> {

	@Override
	public Type deserialize(JsonParser jp, DeserializationContext ctxt)	throws IOException, JsonProcessingException {
		JsonNode node = jp.getCodec().readTree(jp);
		String typeString = node.asText();
		Type type = Type.fromString(typeString);
		return type;
	}

}
