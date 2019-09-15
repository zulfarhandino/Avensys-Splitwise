package com.avensystraining.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avensystraining.springboot.dao.UserDebtRepository;
import com.avensystraining.springboot.entity.UserDebt;

@Service
public class UserDebtServiceImpl implements UserDebtService {

	private UserDebtRepository userDebtRepository;
	
	@Autowired
	public UserDebtServiceImpl(UserDebtRepository userDebtRepository) {
		this.userDebtRepository = userDebtRepository;
	}
	
	@Override
	@Transactional
	public List<UserDebt> findAll() {
		return userDebtRepository.findAll();
	}

	@Override
	@Transactional
	public UserDebt findById(int id) {
		// TODO Auto-generated method stub
		Optional<UserDebt> result = userDebtRepository.findById(id);
		UserDebt userDebt = null;
		
		if(result.isPresent()) {
			userDebt = result.get();
		}
		else {
			throw new RuntimeException("UserDebt id: " + id + " not found.");
		}
		return userDebt;
	}

	@Override
	@Transactional
	public void save(UserDebt userDebt) {
		userDebtRepository.save(userDebt);
	}

	@Override
	@Transactional
	public void delete(int id) {
		userDebtRepository.deleteById(id);
	}
	
}
