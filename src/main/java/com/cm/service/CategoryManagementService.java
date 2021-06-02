package com.cm.service;

import java.util.Locale.Category;

import org.springframework.http.ResponseEntity;

import com.cm.entity.Categories;
import com.cm.request.CategoryRequest;
import com.cm.response.CategoryResponse;

public interface CategoryManagementService {
	
	public void createCategory(Categories categories);
	
	public CategoryResponse getCategories();
	
	public void deleteCategory();
	
	public void deleteById(int id);
	
	public Categories updateCategory(Categories categories,int id);

}
