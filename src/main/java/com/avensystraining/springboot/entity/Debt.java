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
@Table(name="Debt")
public class Debt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Debt_Id")
	private int debt_id;
	
	@Column(name="Debt_Amt")
	private double debt_amt;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Group_Id")
	private Grouping group;
	
	public Debt() {
		
	}

	public Debt(int debt_id, double debt_amt, Grouping group) {
		super();
		this.debt_id = debt_id;
		this.debt_amt = debt_amt;
		this.group = group;
	}

	public Debt(double debt_amt, Grouping group) {
		super();
		this.debt_amt = debt_amt;
		this.group = group;
	}

	public int getDebt_id() {
		return debt_id;
	}

	public void setDebt_id(int debt_id) {
		this.debt_id = debt_id;
	}

	public double getDebt_amt() {
		return debt_amt;
	}

	public void setDebt_amt(double debt_amt) {
		this.debt_amt = debt_amt;
	}

	public Grouping getGroup() {
		return group;
	}

	public void setGroup(Grouping group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Debt [debt_id=" + debt_id + ", debt_amt=" + debt_amt + ", group=" + group + "]";
	}
	
	
}
