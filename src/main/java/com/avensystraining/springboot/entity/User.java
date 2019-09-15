package com.avensystraining.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_Id")
	private int id;
	
	@Column(name="User_Name")
	private String user_name;
	
	@Column(name="User_Email")
	private String user_email;
	
	@Column(name="User_Password")
	private String user_password;
	
	public User() {
		
	}
	
	public User(int id, String user_name, String user_email, String user_password) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_password = user_password;
	}

	public User(String user_name, String user_email, String user_password) {
		super();
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_password = user_password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", user_email=" + user_email + ", user_password="
				+ user_password + "]";
	}

	
}
