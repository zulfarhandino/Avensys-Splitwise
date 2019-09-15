package com.avensystraining.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avensystraining.springboot.dao.ExpenseRepository;
import com.avensystraining.springboot.entity.Expense;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	private ExpenseRepository expenseRepository;
	
	@Autowired
	public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	@Override
	@Transactional
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

	@Override
	@Transactional
	public Expense findById(int id) {
		// TODO Auto-generated method stub
		Optional<Expense> result = expenseRepository.findById(id);
		Expense expense = null;
		
		if(result.isPresent()) {
			expense = result.get();
		}
		else {
			throw new RuntimeException("Expense id: " + id + " not found.");
		}
		return expense;
	}

	@Override
	@Transactional
	public void save(Expense expense) {
		expenseRepository.save(expense);
	}

	@Override
	@Transactional
	public void delete(int id) {
		expenseRepository.deleteById(id);
	}
	
}
