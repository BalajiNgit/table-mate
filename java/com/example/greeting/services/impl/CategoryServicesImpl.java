package com.example.greeting.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.greeting.dao.CategoryDAO;
import com.example.greeting.model.Category;
import com.example.greeting.model.CategoryItems;
import com.example.greeting.model.SubCategory;
import com.example.greeting.services.CategoryServices;
@Service
public class CategoryServicesImpl implements CategoryServices{

	@Autowired
    private CategoryDAO categoryDAO;
	
	@Override
	public List<Category> loadCategory() {
		// TODO Auto-generated method stub
		List<Category> allCategory=null;
		try{
			allCategory=categoryDAO.loadAllCategory();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return allCategory;
	}

	@Override
	public List<SubCategory> loadSubCategory(Category category) {
		// TODO Auto-generated method stub
		List<SubCategory> subCategory = new ArrayList<SubCategory>();
		try{
			subCategory=categoryDAO.loadSubCategory(category);
		}catch(Exception e){
			e.printStackTrace();
		}
		return subCategory;
	}

	@Override
	public List<CategoryItems> loadCategoryItems(SubCategory SubCategory) {
		// TODO Auto-generated method stub
		List<CategoryItems> allItemCategory = new ArrayList<CategoryItems>();
		try{
			allItemCategory=categoryDAO.loadCategoryItems(SubCategory);
		}catch(Exception e){
			e.printStackTrace();
		}
		return allItemCategory;
	}

}
