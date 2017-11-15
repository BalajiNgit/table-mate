package com.example.greeting.dao;

import java.util.List;

import com.example.greeting.model.Category;
import com.example.greeting.model.CategoryItems;
import com.example.greeting.model.SubCategory;

public interface CategoryDAO {
	public List<Category> loadAllCategory();
	public List<SubCategory> loadSubCategory(Category category);
	public List<CategoryItems> loadCategoryItems(SubCategory SubCategory);
}
