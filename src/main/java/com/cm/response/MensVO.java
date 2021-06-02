package com.cm.response;

import java.util.List;

import com.cm.entity.Footwear;
import com.cm.entity.Shirts;
import com.cm.entity.TShirts;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MensVO {
	
	@JsonProperty("Footwear")
	private List<Footwear> footwear;
	
	@JsonProperty("T-Shirts")
	private List<TShirts> tShirts;
	
	@JsonProperty("Shirts")
	private List<Shirts> shirts;

}
