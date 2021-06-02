package com.cm;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cm.entity.Categories;
import com.cm.entity.Footwear;
import com.cm.entity.Mens;
import com.cm.entity.Shirts;
import com.cm.entity.TShirts;
import com.fasterxml.jackson.databind.ObjectMapper;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class CategoryManagementAppTest {
	
	@Test
	void contextLoads() {
	}
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	@SneakyThrows
	public void testCreateCategory() {
		Categories categories=new Categories();
		categories.setType("Men");
		Mens mens=new Mens();
		Footwear footwear =new Footwear();
		TShirts tshirts=new TShirts();
		Shirts shirts=new Shirts();
		footwear.setBranded("Branded");
		footwear.setNonBranded("NB");
		mens.setFootwear(footwear);
		tshirts.setCausalTShirts("CT");
		tshirts.setPlainTShirts("ptt");
		tshirts.setPlainTShirts("plainTShirts");
		mens.setTshirts(tshirts);
		shirts.setCausalShirts("causalShirts");
		shirts.setPartyShirts("partyShirts");
		shirts.setPlainShirts("plainShirts");
		mens.setShirts(shirts);
		
		
		MvcResult result=mvc.perform(
				MockMvcRequestBuilders.post("/categories").content(asJsonString(categories))
				.accept(MediaType.APPLICATION_JSON)
				 .contentType(MediaType.APPLICATION_JSON))
				.andReturn();
		int status=result.getResponse().getStatus();
		log.info("testCategory response code>>"+status);
		assert(200 == status);
	}
	
	/*@Test
	@SneakyThrows
	public void testGetCategory() {
		MvcResult result=mvc.perform(
				MockMvcRequestBuilders.get("/categories")
				//.accept(MediaType.APPLICATION_JSON)
				 .contentType(MediaType.APPLICATION_JSON))
				.andReturn();
		int status=result.getResponse().getStatus();
		log.info("testGetCategory response code>>"+status);
		assert(200 == status);
	}*/ 
	@Test
	@SneakyThrows
	public void testCategoryDelete() {
		MvcResult result=mvc.perform(
				MockMvcRequestBuilders.delete("/categories")
				.accept(MediaType.APPLICATION_JSON)
				 .contentType(MediaType.APPLICATION_JSON))
				.andReturn();
		int status=result.getResponse().getStatus();
		log.info("testCategoryDelete response code>>"+status);
		assert(200 == status);
	}
	
	@Test
	@SneakyThrows
	public void testCreateCategory2() {
		Categories categories=new Categories();
		categories.setType("Men");
		Mens mens=new Mens();
		Footwear footwear =new Footwear();
		TShirts tshirts=new TShirts();
		Shirts shirts=new Shirts();
		footwear.setBranded("Branded");
		footwear.setNonBranded("NB");
		mens.setFootwear(footwear);
		tshirts.setCausalTShirts("CT");
		tshirts.setPlainTShirts("ptt");
		tshirts.setPlainTShirts("plainTShirts");
		mens.setTshirts(tshirts);
		shirts.setCausalShirts("causalShirts");
		shirts.setPartyShirts("partyShirts");
		shirts.setPlainShirts("plainShirts");
		mens.setShirts(shirts);
		
		
		MvcResult result=mvc.perform(
				MockMvcRequestBuilders.post("/categories").content(asJsonString(categories))
				.accept(MediaType.APPLICATION_JSON)
				 .contentType(MediaType.APPLICATION_JSON))
				.andReturn();
		int status=result.getResponse().getStatus();
		log.info("testCategory2 response code>>"+status);
		assert(200 == status);
	}
	
	
	
	private static String asJsonString(final Object obj) {
		try {
			String jsonString=new ObjectMapper().writeValueAsString(obj);
			//log.info("jsonString>>"+jsonString);
			return new ObjectMapper().writeValueAsString(obj);
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}

}
