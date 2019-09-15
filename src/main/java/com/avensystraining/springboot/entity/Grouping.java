package com.avensystraining.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Grouping")
public class Grouping {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Group_Id")
	private int group_id;
	
	@Column(name="Group_Name")
	private String group_name;
	
	public Grouping() {
		
	}
	
	public Grouping(int group_id, String group_name) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
	}

	public Grouping(String group_name) {
		super();
		this.group_name = group_name;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	
	
}
