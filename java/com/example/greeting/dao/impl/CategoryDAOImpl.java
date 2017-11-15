package com.example.greeting.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.example.greeting.dao.CategoryDAO;
import com.example.greeting.model.Category;
import com.example.greeting.model.CategoryItems;
import com.example.greeting.model.SubCategory;
import com.mysql.jdbc.StringUtils;

@Transactional
@Repository
public class CategoryDAOImpl implements CategoryDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Category> loadAllCategory() {
		// TODO Auto-generated method stub
		StringBuilder category=new StringBuilder("Select * from category");
		Query query=entityManager.createNativeQuery(category.toString());
		List<Object[]> result=query.getResultList();
		List<Category> allCategory=new ArrayList<>(result.size());
		for (Object[] r : result) {
			Category c=new Category((int)r[0],(String)r[1],(String)r[2]);
			allCategory.add(c);
		}
		return allCategory;
	}

	@Override
	public List<SubCategory> loadSubCategory(Category category) {
		// TODO Auto-generated method stub
		List<Object[]> result=null;
		List<SubCategory> allSubCategory=null;
		if(!StringUtils.isNullOrEmpty(String.valueOf(category.getCategoryId())) && category.getCategoryId()!=-1){
			StringBuilder subCategory=new StringBuilder("Select * from sub_category where category_id=:categoryId");
			Query query=entityManager.createNativeQuery(subCategory.toString());
			query.setParameter("categoryId",category.getCategoryId());
			result= query.getResultList();
			allSubCategory=new ArrayList<>(result.size());
		}else{
			StringBuilder subCategory=new StringBuilder("Select * from sub_category");
			Query query=entityManager.createNativeQuery(subCategory.toString());
			result= query.getResultList();
			allSubCategory=new ArrayList<>(result.size());
		}
		for (Object[] r : result) {
			SubCategory c=new SubCategory((int)r[0],(String)r[1],(int)r[2]);
			allSubCategory.add(c);
		}
		return allSubCategory;
		
	}

	@Override
	public List<CategoryItems> loadCategoryItems(SubCategory SubCategory) {
		// TODO Auto-generated method stub
		List<Object[]> result=null;
		List<CategoryItems> allItemCategory=null;
		if(!StringUtils.isNullOrEmpty(String.valueOf(SubCategory.getCategoryId()))
				&&!StringUtils.isNullOrEmpty(String.valueOf(SubCategory.getSubCategoryId())) 
				&& SubCategory.getCategoryId()!=-1){
			StringBuilder categoryItems=null;
			Query query=null;
			if(SubCategory.getSubCategoryId()!=0){
				categoryItems=new StringBuilder("Select * from category_items where category_id=:categoryId"
						+ " AND sub_category_id=:subCategoryId");
				query=entityManager.createNativeQuery(categoryItems.toString());
				query.setParameter("categoryId",SubCategory.getCategoryId());
				query.setParameter("subCategoryId",SubCategory.getSubCategoryId());
				result= query.getResultList();
				allItemCategory=new ArrayList<>(result.size());
			}else{
				categoryItems=new StringBuilder("Select * from category_items where category_id=:categoryId");
				query=entityManager.createNativeQuery(categoryItems.toString());
				query.setParameter("categoryId",SubCategory.getCategoryId());
				result= query.getResultList();
				allItemCategory=new ArrayList<>(result.size());
			}
			
		}else{
			StringBuilder categoryItems=new StringBuilder("Select * from category_items");
			Query query=entityManager.createNativeQuery(categoryItems.toString());
			result= query.getResultList();
			allItemCategory=new ArrayList<>(result.size());
		}
		for (Object[] r : result) {
			CategoryItems c=new CategoryItems((int)r[0],(String)r[1],(String)r[2],(String)r[3],(int)r[4],(int)r[5]);
			allItemCategory.add(c);
		}
		return allItemCategory;
	}

}
