package com.PetStore.ThePawsGalore.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
	private String name;
	private String email;
	@Id
	private String mobile;
	private String comment;
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(String name, String email, String mobile, String comment) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.comment = comment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Comment [name=" + name + ", email=" + email + ", mobile=" + mobile + ", comment=" + comment + "]";
	}
	

}
