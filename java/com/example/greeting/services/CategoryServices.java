package com.example.greeting.services;

import java.util.List;

import com.example.greeting.model.Category;
import com.example.greeting.model.CategoryItems;
import com.example.greeting.model.SubCategory;

public interface CategoryServices {
	public List<Category> loadCategory();
	public List<SubCategory> loadSubCategory(Category category);
	public List<CategoryItems> loadCategoryItems(SubCategory SubCategory);
}
