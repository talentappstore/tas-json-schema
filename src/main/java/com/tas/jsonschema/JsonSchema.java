package com.tas.jsonschema;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class JsonSchema {

	@JsonProperty("$schema")
	private String schema;
	private String title;
	private String id;
	private Type type = Type.OBJECT;
	@JsonInclude(Include.NON_EMPTY)
	private Map<String, JsonSchema> properties = new LinkedHashMap<>();
	private Boolean additionalProperties;
	@JsonInclude(Include.NON_EMPTY)
	private Set<String> required = new LinkedHashSet<>();

	private String description;
	@JsonProperty("default")
	private String defaultText;
	@JsonInclude(Include.NON_EMPTY)
	private List<? extends JsonSchema> allOf = new ArrayList<>();
	@JsonInclude(Include.NON_EMPTY)
	private List<? extends JsonSchema> anyOf = new ArrayList<>();
	@JsonInclude(Include.NON_EMPTY)
	private List<? extends JsonSchema> oneOf = new ArrayList<>();
	private String format;
	private Integer propertyOrder;
	private Integer minItems;
	private Integer minLength;
	private Integer minimum;
	private Integer maxItems;
	private Integer maxLength;
	private Integer maximum;
	private String pattern;
	private Media media;
	@JsonProperty("enum")
	private List<String> _enum;
	private JsonSchema items;
	private Boolean uniqueItems;

	@JsonIgnore
	private Map<String, Object> additionalPropertiesMap = new HashMap<>();

	@JsonInclude(Include.ALWAYS)
	@JsonAnyGetter
	public Map<String, Object> getAdditionalPropertyMap() {
		return this.additionalPropertiesMap;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalPropertiesMap.put(name, value);
	}

	public Integer getMinItems() {
		return minItems;
	}

	public void setMinItems(Integer minItems) {
		this.minItems = minItems;
	}

	public Integer getMaxItems() {
		return maxItems;
	}

	public void setMaxItems(Integer maxItems) {
		this.maxItems = maxItems;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefaultText() {
		return defaultText;
	}

	public void setDefaultText(String defaultText) {
		this.defaultText = defaultText;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getPropertyOrder() {
		return propertyOrder;
	}

	public void setPropertyOrder(Integer propertyOrder) {
		this.propertyOrder = propertyOrder;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	public Integer getMinimum() {
		return minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	public Integer getMaximum() {
		return maximum;
	}

	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public List<? extends JsonSchema> getAllOf() {
		return allOf;
	}

	public void setAllOf(List<? extends JsonSchema> allOf) {
		this.allOf = allOf;
	}

	public List<? extends JsonSchema> getAnyOf() {
		return anyOf;
	}

	public void setAnyOf(List<? extends JsonSchema> anyOf) {
		this.anyOf = anyOf;
	}

	public List<? extends JsonSchema> getOneOf() {
		return oneOf;
	}

	public void setOneOf(List<? extends JsonSchema> oneOf) {
		this.oneOf = oneOf;
	}

	@JsonInclude(Include.NON_EMPTY)
	public List<String> get_enum() {
		if (_enum == null) {
			_enum = new ArrayList<>();
		}
		return _enum;
	}

	public void set_enum(List<String> _enum) {
		this._enum = _enum;
	}

	public JsonSchema getItems() {
		return items;
	}

	public void setItems(JsonSchema items) {
		this.items = items;
	}

	public Boolean getUniqueItems() {
		return uniqueItems;
	}

	public void setUniqueItems(Boolean uniqueItems) {
		this.uniqueItems = uniqueItems;
	}

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Map<String, JsonSchema> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, JsonSchema> properties) {
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

	public void setRequired(Collection<String> required) {
		this.required = new LinkedHashSet<>(required);
	}

}
