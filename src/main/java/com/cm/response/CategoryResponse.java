package com.cm.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CategoryResponse {
	@JsonProperty("Mens")
	private MensVO mens;
	
	@JsonProperty("Womens")
	private WomensVO womensVO;

}
