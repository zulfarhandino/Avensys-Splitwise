package com.avensystraining.springboot.service;

import java.util.List;

import com.avensystraining.springboot.entity.Expense;

public interface ExpenseService {
	
	public List<Expense> findAll();
	
	public Expense findById(int id);
	
	public void save(Expense expense);
	
	public void delete(int id);

}
