package com.cm.response;

import java.util.List;

import com.cm.entity.Dress;
import com.cm.entity.TShirts;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WomensVO {
	
	@JsonProperty("Dresses")
	private List<Dress> dress;
	
	@JsonProperty("T-Shirts")
	private List<TShirts> tShirts;
	
	

}
