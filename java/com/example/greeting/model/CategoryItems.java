package com.example.greeting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="category_items")
public class CategoryItems {

	@Id
    @Column(name="category_items_id")
    @JsonProperty(value="category_items_id")
	private int categoryItemsId;
	
	@Column(name="category_items_name")
    @JsonProperty(value="category_items_name")
	private String categoryItemsName;
	
	@Column(name="category_items_type")
	@JsonProperty(value="category_items_type")
	private String categoryItemsType;
	
	@Column(name="category_items_price")
	@JsonProperty(value="category_items_price")
	private String categoryItemsPrice;
	
	
    @Column(name="category_id")
    @JsonProperty(value="category_id")
	private int categoryId;
	
	@Column(name="sub_category_id")
	@JsonProperty(value="sub_category_id")
    private int subCategoryId;

	public int getCategoryItemsId() {
		return categoryItemsId;
	}

	public void setCategoryItemsId(int categoryItemsId) {
		this.categoryItemsId = categoryItemsId;
	}

	public String getCategoryItemsName() {
		return categoryItemsName;
	}

	public void setCategoryItemsName(String categoryItemsName) {
		this.categoryItemsName = categoryItemsName;
	}

	public String getCategoryItemsType() {
		return categoryItemsType;
	}

	public void setCategoryItemsType(String categoryItemsType) {
		this.categoryItemsType = categoryItemsType;
	}

	public String getCategoryItemsPrice() {
		return categoryItemsPrice;
	}

	public void setCategoryItemsPrice(String categoryItemsPrice) {
		this.categoryItemsPrice = categoryItemsPrice;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public CategoryItems(@JsonProperty(value="category_items_id")int categoryItemsId,@JsonProperty(value="category_items_name") String categoryItemsName,
			@JsonProperty(value="category_items_type")String categoryItemsType,@JsonProperty(value="category_items_price") String categoryItemsPrice,
			@JsonProperty(value="category_id")int categoryId, @JsonProperty(value="sub_category_id")int subCategoryId) {
		super();
		this.categoryItemsId = categoryItemsId;
		this.categoryItemsName = categoryItemsName;
		this.categoryItemsType = categoryItemsType;
		this.categoryItemsPrice = categoryItemsPrice;
		this.categoryId = categoryId;
		this.subCategoryId = subCategoryId;
	}
	
	
}
