package com.avensystraining.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avensystraining.springboot.dao.UserExpRepository;
import com.avensystraining.springboot.entity.UserExp;

@Service
public class UserExpServiceImpl implements UserExpService {

	private UserExpRepository userExpRepository;
	
	@Autowired
	public UserExpServiceImpl(UserExpRepository userExpRepository) {
		this.userExpRepository = userExpRepository;
	}
	
	@Override
	@Transactional
	public List<UserExp> findAll() {
		return userExpRepository.findAll();
	}

	@Override
	@Transactional
	public UserExp findById(int id) {
		// TODO Auto-generated method stub
		Optional<UserExp> result = userExpRepository.findById(id);
		UserExp userExp = null;
		
		if(result.isPresent()) {
			userExp = result.get();
		}
		else {
			throw new RuntimeException("UserExp id: " + id + " not found.");
		}
		return userExp;
	}

	@Override
	@Transactional
	public void save(UserExp userExp) {
		userExpRepository.save(userExp);
	}

	@Override
	@Transactional
	public void delete(int id) {
		userExpRepository.deleteById(id);
	}
	
}
