package com.tas.jsonschema;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class JsonSchema {

	@JsonProperty("$schema")
	private String schema;
	private String title;
	private Type type = Type.OBJECT;
	private Map<String, Property> properties = new HashMap<String, Property>();
	
	public JsonSchema() {
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Type getType() {
		return type;
	}

	public Map<String, Property> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Property> properties) {
		this.properties = properties;
	}

}
