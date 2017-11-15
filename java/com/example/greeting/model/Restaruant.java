package com.example.greeting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="restaruant_info")
public class Restaruant {
	
	
	@Id
    @Column(name="restarunat_id")
    @JsonProperty(value="r_id")
	int restarunat_id;
	
	
    @Column(name="restaruant_name")
    @JsonProperty(value="r_name")
	String restarunat_name;
	
	
    @Column(name="restaruant_address")
    @JsonProperty(value="r_addr")
	String restarunat_address;
	
	public int getRestarunat_id() {
		return restarunat_id;
	}
	public void setRestarunat_id(int restarunat_id) {
		this.restarunat_id = restarunat_id;
	}
	public String getRestarunat_name() {
		return restarunat_name;
	}
	public void setRestarunat_name(String restarunat_name) {
		this.restarunat_name = restarunat_name;
	}
	public String getRestarunat_address() {
		return restarunat_address;
	}
	public void setRestarunat_address(String restarunat_address) {
		this.restarunat_address = restarunat_address;
	}
	
	public Restaruant(@JsonProperty(value="r_id")int restarunat_id, @JsonProperty(value="r_name")String restarunat_name,
			 @JsonProperty(value="r_addr")String restarunat_address) {
		
		this.restarunat_id = restarunat_id;
		this.restarunat_name = restarunat_name;
		this.restarunat_address = restarunat_address;
	}

}
