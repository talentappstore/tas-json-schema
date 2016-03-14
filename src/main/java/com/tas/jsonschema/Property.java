package com.tas.jsonschema;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Deprecated
@JsonInclude(Include.NON_NULL)
public class Property extends JsonSchema {
}
