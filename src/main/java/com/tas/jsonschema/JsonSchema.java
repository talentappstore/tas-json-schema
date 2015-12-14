package com.tas.jsonschema;

import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class JsonSchema {

	@JsonProperty("$schema")
	private String schema;
	private String title;
	private URI id;
	private Type type = Type.OBJECT;
	private Map<String, Property> properties = new HashMap<>();
	private Boolean additionalProperties;
	private Set<String> required = new HashSet<>();
	
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

	public URI getId() {
		return id;
	}

	public void setId(URI id) {
		this.id = id;
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

	public Boolean getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Boolean additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	public Set<String> getRequired() {
		return required;
	}

	public void setRequired(Set<String> required) {
		this.required = required;
	}

}
