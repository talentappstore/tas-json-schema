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
		
		Property nameProperty = new Property();
		nameProperty.setType(Type.STRING);
		nameProperty.setDescription("First and last name");
		jsonSchema.getProperties().put("Name", nameProperty);
		
		Property ageProperty = new Property();
		ageProperty.setType(Type.INTEGER);
		jsonSchema.getProperties().put("Age", ageProperty);
		
		Property favoriteColorProperty = new Property();
		favoriteColorProperty.setType(Type.STRING);
		favoriteColorProperty.setFormat(Format.color);
		jsonSchema.getProperties().put("Favorite color", favoriteColorProperty);
		
		Property enumProperty = new Property();
		enumProperty.setType(Type.STRING);
		List<String> enums = new ArrayList<String>();
		enums.add("");
		enums.add("a");
		enums.add("b");
		enums.add("c");
		enumProperty.set_enum(enums);
		jsonSchema.getProperties().put("Choose", enumProperty);
		
		Property arrayProperty = new Property();
		arrayProperty.setType(Type.ARRAY);
		arrayProperty.setFormat(Format.checkbox);
		List<Property> itemsProperty = new ArrayList<Property>();
		Property items = new Property();
		items.setType(Type.STRING);
		
		List<String> itemsEnums = new ArrayList<String>();
		itemsEnums.add("a");
		itemsEnums.add("z");
		items.set_enum(itemsEnums);
		itemsProperty.add(items);
		arrayProperty.setItems(itemsProperty);
		arrayProperty.setUniqueItems(true);
		jsonSchema.getProperties().put("array", arrayProperty);
		
		String json = objectMapper.writeValueAsString(jsonSchema);
		System.out.println(json);
		
	}
	
}
