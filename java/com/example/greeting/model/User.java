package com.example.greeting.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="user_master_details")
public class User implements Serializable{
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
	    @Column(name="uid")
	    @JsonProperty(value="uid")
	    private Integer uid;
	    
	    @Column(name="username")
	    @JsonProperty(value="userName")
	    private String userName;
	    
	    @Column(name="password")
	    @JsonProperty(value="password")
	    private String password;
	    
	    @Column(name="isactive")
	    @JsonProperty(value="isActive")
	    private String isActive;
	    
	    @Column(name="groupCode")
	    @JsonProperty(value="userGroupCode")
	    private String userGroupCode;
	    
	    @Column(name="createDate")
	    @JsonProperty(value="createDate")
	    private Date  createDate;

		public Integer getUid() {
			return uid;
		}

		public void setUid(Integer uid) {
			this.uid = uid;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getIsActive() {
			return isActive;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}

		public String getUserGroupCode() {
			return userGroupCode;
		}

		public void setUserGroupCode(String userGroupCode) {
			this.userGroupCode = userGroupCode;
		}

		public Date getCreateDate() {
			return createDate;
		}

		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
	    
	    

}
