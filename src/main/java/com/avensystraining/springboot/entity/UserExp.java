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
@Table(name="User_Exp")
public class UserExp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_Id")
	private User user;
	
	@Column(name="Expense_Amt")
	private double expense_amt;
	
	public UserExp() {
		
	}

	public UserExp(int id, User user, double expense_amt) {
		super();
		this.id = id;
		this.user = user;
		this.expense_amt = expense_amt;
	}

	public UserExp(User user, double expense_amt) {
		super();
		this.user = user;
		this.expense_amt = expense_amt;
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

	public double getExpense_amt() {
		return expense_amt;
	}

	public void setExpense_amt(double expense_amt) {
		this.expense_amt = expense_amt;
	}

	@Override
	public String toString() {
		return "UserExp [id=" + id + ", user=" + user + ", expense_amt=" + expense_amt + "]";
	}

	 
}
