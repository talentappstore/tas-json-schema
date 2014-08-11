package com.tas.jsonschema;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class Property {

	private Type type;
	private String description;
	private Boolean required;
	private Format format;
	private Integer propertyOrder;
	@JsonProperty("enum")
	private List<String> _enum;
	private Property items;
	private Boolean uniqueItems;
	
	public Property() {
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean isRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public Integer getPropertyOrder() {
		return propertyOrder;
	}

	public void setPropertyOrder(Integer propertyOrder) {
		this.propertyOrder = propertyOrder;
	}

	public List<String> get_enum() {
		return _enum;
	}

	public void set_enum(List<String> _enum) {
		this._enum = _enum;
	}

	public Property getItems() {
		return items;
	}

	public void setItems(Property items) {
		this.items = items;
	}

	public Boolean getUniqueItems() {
		return uniqueItems;
	}

	public void setUniqueItems(Boolean uniqueItems) {
		this.uniqueItems = uniqueItems;
	}
	
}