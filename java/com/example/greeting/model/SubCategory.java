package com.example.greeting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="sub_category")
public class SubCategory {
	
	@Id
    @Column(name="sub_category_id")
    @JsonProperty(value="sub_category_id")
	private int subCategoryId;
	
	@Column(name="sub_category_name")
    @JsonProperty(value="sub_category_name")
	private String subCategoryName;
    
    @Column(name="category_id")
    @JsonProperty(value="category_id")
	private int categoryId;

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public SubCategory(@JsonProperty(value="sub_category_id")int subCategoryId,
			@JsonProperty(value="sub_category_name")String subCategoryName,@JsonProperty(value="category_id")int categoryId) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.categoryId = categoryId;
	}

	
}
