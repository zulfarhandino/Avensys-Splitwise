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
@Table(name="Expense")
public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Expense_Id")
	private int expense_id;
	
	@Column(name="Expense_Amt")
	private String expense_amt;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Group_Id")
	private Grouping grouping;
	
	public Expense() {
		
	}

	public Expense(int expense_id, String expense_amt, Grouping grouping) {
		super();
		this.expense_id = expense_id;
		this.expense_amt = expense_amt;
		this.grouping = grouping;
	}

	public Expense(String expense_amt, Grouping grouping) {
		super();
		this.expense_amt = expense_amt;
		this.grouping = grouping;
	}

	public int getExpense_id() {
		return expense_id;
	}

	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}

	public String getExpense_amt() {
		return expense_amt;
	}

	public void setExpense_amt(String expense_amt) {
		this.expense_amt = expense_amt;
	}

	public Grouping getGrouping() {
		return grouping;
	}

	public void setGrouping(Grouping grouping) {
		this.grouping = grouping;
	}
	
}
