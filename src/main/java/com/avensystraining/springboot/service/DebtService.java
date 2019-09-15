package com.avensystraining.springboot.service;

import java.util.List;

import com.avensystraining.springboot.entity.Debt;

public interface DebtService {
	
	public List<Debt> findAll();
	
	public Debt findById(int id);
	
	public void save(Debt debt);
	
	public void delete(int id);

}
