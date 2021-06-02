package com.cm.repository;

import org.springframework.data.repository.CrudRepository;

import com.cm.entity.Categories;

public interface CategoryManagementRepo extends CrudRepository<Categories,Integer>{

}
