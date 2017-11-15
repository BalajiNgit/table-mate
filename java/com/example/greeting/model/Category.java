package com.example.greeting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@Column(name="category_id")
    @JsonProperty(value="category_id")
	private int categoryId;
	
	@Column(name="category_number")
    @JsonProperty(value="category_number")
	private String categoryNumber;
	
    @Column(name="category_name")
    @JsonProperty(value="category_name")
	private String categoryName;


	public Category( @JsonProperty(value="category_id")int categoryId, @JsonProperty(value="category_number")String categoryNumber, @JsonProperty(value="category_name")String categoryName) {
		this.categoryId = categoryId;
		this.categoryNumber = categoryNumber;
		this.categoryName = categoryName;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryNumber() {
		return categoryNumber;
	}


	public void setCategoryNumber(String categoryNumber) {
		this.categoryNumber = categoryNumber;
	}


	public String getCategoryName() {
		return categoryName;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryNumber="
				+ categoryNumber + ", categoryName=" + categoryName + "]";
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	
    
	
}
