package com.avensystraining.springboot.service;

import java.util.List;

import com.avensystraining.springboot.entity.UserExp;

public interface UserExpService {
	
	public List<UserExp> findAll();
	
	public UserExp findById(int id);
	
	public void save(UserExp userExp);
	
	public void delete(int id);

}
