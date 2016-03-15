package com.tas.jsonschema;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {

	@Test
	public void testToJson() throws Exception {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		JsonSchema jsonSchema = new JsonSchema();
		jsonSchema.setTitle("Person");
		
		JsonSchema nameProperty = new JsonSchema();
		nameProperty.setType(Type.STRING);
		nameProperty.setDescription("First and last name");
		jsonSchema.getProperties().put("Name", nameProperty);
		
		JsonSchema ageProperty = new JsonSchema();
		ageProperty.setType(Type.INTEGER);
		jsonSchema.getProperties().put("Age", ageProperty);
		
		JsonSchema favoriteColorProperty = new JsonSchema();
		favoriteColorProperty.setType(Type.STRING);
		favoriteColorProperty.setFormat(Format.color);
		jsonSchema.getProperties().put("Favorite color", favoriteColorProperty);
		
		JsonSchema enumProperty = new JsonSchema();
		enumProperty.setType(Type.STRING);
		List<String> enums = new ArrayList<>();
		enums.add("");
		enums.add("a");
		enums.add("b");
		enums.add("c");
		enumProperty.set_enum(enums);
		jsonSchema.getProperties().put("Choose", enumProperty);
		
		JsonSchema arrayProperty = new JsonSchema();
		arrayProperty.setType(Type.ARRAY);
		arrayProperty.setFormat(Format.checkbox);
		JsonSchema itemsProperty = new JsonSchema();
		itemsProperty.setType(Type.STRING);
		
		List<String> itemsEnums = new ArrayList<>();
		itemsEnums.add("a");
		itemsEnums.add("z");
		itemsProperty.set_enum(itemsEnums);
		arrayProperty.setItems(itemsProperty);
		arrayProperty.setUniqueItems(true);
		jsonSchema.getProperties().put("array", arrayProperty);
		
		String json = objectMapper.writeValueAsString(jsonSchema);
		System.out.println(json);
		
	}
	
}
