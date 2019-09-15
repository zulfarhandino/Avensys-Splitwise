package com.avensystraining.springboot.service;

import java.util.List;

import com.avensystraining.springboot.entity.UserDebt;

public interface UserDebtService {
	
	public List<UserDebt> findAll();
	
	public UserDebt findById(int id);
	
	public void save(UserDebt userDebt);
	
	public void delete(int id);

}
