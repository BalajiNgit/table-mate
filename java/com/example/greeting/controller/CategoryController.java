package com.example.greeting.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.model.Category;
import com.example.greeting.model.CategoryItems;
import com.example.greeting.model.SubCategory;
import com.example.greeting.services.CategoryServices;

@RestController
@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE,value="/menu")
public class CategoryController {
	
	@Autowired
	private CategoryServices categoryServices;
    
    @RequestMapping(value="/loadCategory",method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> loadMenuCategory() throws Exception{
    	try{
    		ArrayList<Category> Categorys=(ArrayList<Category>) categoryServices.loadCategory();
    		return new ResponseEntity<>(Categorys,HttpStatus.OK);
    	}catch(Exception e){
    		e.printStackTrace();
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
	}
    
    @RequestMapping(value="/loadSubCategory",method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> loadSubCategory(@RequestBody Category category,HttpServletRequest request) throws Exception{
    	try{
    		ArrayList<SubCategory> SubCategorys=(ArrayList<SubCategory>)categoryServices.loadSubCategory(category);
    		return new ResponseEntity<>(SubCategorys,HttpStatus.OK);
    	}catch(Exception e){
    		e.printStackTrace();
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
	}
    
    @RequestMapping(value="/loadCategoryItems",method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> loadCategoryItems(@RequestBody SubCategory subCategory,HttpServletRequest request) throws Exception{
    	try{
    		ArrayList<CategoryItems> AllCategoryItems=(ArrayList<CategoryItems>)categoryServices.loadCategoryItems(subCategory);
    		return new ResponseEntity<>(AllCategoryItems,HttpStatus.OK);
    	}catch(Exception e){
    		e.printStackTrace();
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
	}

}
