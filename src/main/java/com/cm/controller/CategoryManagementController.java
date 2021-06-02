package com.cm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cm.entity.Categories;
import com.cm.response.CategoryResponse;
import com.cm.service.CategoryManagementService;







@RestController
public class CategoryManagementController {
	
	@Autowired
	private CategoryManagementService categoryManagementService;
	
	@PostMapping(value = "/categories", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
     public void createCategories(@RequestBody Categories request) {
		
		categoryManagementService.createCategory(request);
		
	}
	
	@GetMapping(value ="/categories",produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoryResponse getCategories() {
		return categoryManagementService.getCategories();
	}
	
	@DeleteMapping(value ="/categories")
	public void deleteCategories() {
		categoryManagementService.deleteCategory();
	}
	
	
	@DeleteMapping(value ="/categories/{id}")
	public void deleteCategoriesById(@PathVariable(value = "id") int id) {
		categoryManagementService.deleteById(id);
	}
	
	@PutMapping(value ="/categories/{id}")
	public ResponseEntity<Object> updateCategories(@RequestBody Categories request, @PathVariable int id){
		categoryManagementService.updateCategory(request, id);
		return ResponseEntity.ok("resource saved");
		
	}
}
