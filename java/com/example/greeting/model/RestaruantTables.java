package com.example.greeting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="restaruant_table")
public class RestaruantTables {
	
	public RestaruantTables( @JsonProperty(value="_id")int _id, @JsonProperty(value="r_floor")String restarunat_floor,
			 @JsonProperty(value="r_table")String restarunat_tables,@JsonProperty(value="restarunat_id") int restarunat_id) {
		super();
		this._id = _id;
		this.restarunat_floor = restarunat_floor;
		this.restarunat_tables = restarunat_tables;
		this.restarunat_id = restarunat_id;
	}


	@Id
    @Column(name="_id")
    @JsonProperty(value="_id")
	int _id;
	
	
    @Column(name="restarunat_floor")
    @JsonProperty(value="r_floor")
	String restarunat_floor;
	
	
    @Column(name="restaruant_f_table")
    @JsonProperty(value="r_table")
	String restarunat_tables;
    
   
    @Column(name="restarunat_id")
    @JsonProperty(value="restarunat_id")
	int restarunat_id;


	public int get_id() {
		return _id;
	}


	public void set_id(int _id) {
		this._id = _id;
	}


	public String getRestarunat_floor() {
		return restarunat_floor;
	}


	public void setRestarunat_floor(String restarunat_floor) {
		this.restarunat_floor = restarunat_floor;
	}


	public String getRestarunat_tables() {
		return restarunat_tables;
	}


	public void setRestarunat_tables(String restarunat_tables) {
		this.restarunat_tables = restarunat_tables;
	}


	public int getRestarunat_id() {
		return restarunat_id;
	}


	public void setRestarunat_id(int restarunat_id) {
		this.restarunat_id = restarunat_id;
	}
}
