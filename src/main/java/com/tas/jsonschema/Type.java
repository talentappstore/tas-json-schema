package com.tas.jsonschema;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using=TypeSerializer.class)
@JsonDeserialize(using=TypeDeserializer.class)
public enum Type {

	STRING("string"),
	NUMBER("number"),
	INTEGER("integer"),
	BOOLEAN("boolean"),
	OBJECT("object"),
	ARRAY("array"),
	NULL("null");

	private String type;
	
	private Type(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public static Type fromString(String typeString) {
		Type found = null;
		for (Type type : Type.values()) {
			if(type.getType().equals(typeString)) {
				found = type;
			}
		}
		return found;
	}
	
}
