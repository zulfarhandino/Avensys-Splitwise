package com.avensystraining.springboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Group")
public class UserGroup {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_Id")
	private User user;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Group_Id")
	private Grouping grouping;
	
	public UserGroup() {
		
	}

	public UserGroup(int id, User user, Grouping grouping) {
		super();
		this.id = id;
		this.user = user;
		this.grouping = grouping;
	}

	public UserGroup(User user, Grouping grouping) {
		super();
		this.user = user;
		this.grouping = grouping;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Grouping getGrouping() {
		return grouping;
	}

	public void setGrouping(Grouping grouping) {
		this.grouping = grouping;
	}

	@Override
	public String toString() {
		return "UserGroup [id=" + id + ", user=" + user + ", grouping=" + grouping + "]";
	}

	
}
