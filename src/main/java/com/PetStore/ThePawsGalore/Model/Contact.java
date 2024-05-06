package com.PetStore.ThePawsGalore.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	private String name;
	private String address;
	private String email;
	@Id
	private String mobile;
	private String message;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String address, String email, String mobile, String message) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", address=" + address + ", email=" + email + ", mobile=" + mobile
				+ ", message=" + message + "]";
	}

}
